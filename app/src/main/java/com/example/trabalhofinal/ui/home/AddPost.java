package com.example.trabalhofinal.ui.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.trabalhofinal.MainActivity;
import com.example.trabalhofinal.R;
import com.example.trabalhofinal.classes.database.LocalDatabase;
import com.example.trabalhofinal.classes.entities.Post;

import java.util.ArrayList;


public class AddPost extends Fragment {

    com.example.trabalhofinal.databinding.FragmentAddPostBinding binding;

    private LocalDatabase db;

    private String descricao;

    private String titulo;

    public AddPost() {
        // Required empty public constructor
    }
    public static AddPost newInstance(String param1, String param2) {
        AddPost fragment = new AddPost();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = com.example.trabalhofinal.databinding.FragmentAddPostBinding.inflate(inflater, container, false);
        db = LocalDatabase.getDatabase(getContext());



        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        binding.postar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                postar();
            }
        });

    }

    public void postar(){
        if(binding.descricaoPost.getText().equals("") && binding.tituloPost.getText().equals("")){
            Toast.makeText(getActivity(), "Preencha todos os campos", Toast.LENGTH_SHORT).show();
        }
        else{
            Post novo = new Post(MainActivity.user.getNome(), binding.tituloPost.getText().toString(),binding.descricaoPost.getText().toString());
            try{
                db.postModel().insertAll(novo);
            }catch(Exception e){
                Toast.makeText(getActivity(), "Não foi possível realizar o post. Tente novamente em instantes", Toast.LENGTH_SHORT).show();
                System.out.println("\n"+e);
            }
            NavHostFragment.findNavController(this).navigate(R.id.action_addPost_to_navigation_home);
        }
    }

}