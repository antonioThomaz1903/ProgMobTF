package com.example.trabalhofinal.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.example.trabalhofinal.R;
import com.example.trabalhofinal.classes.database.LocalDatabase;
import com.example.trabalhofinal.classes.entities.Post;
import com.example.trabalhofinal.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {
    private com.example.trabalhofinal.databinding.FragmentHomeBinding binding;

    private boolean status = false;


    List<Post> postes;

    private LocalDatabase db;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        binding = FragmentHomeBinding.inflate(inflater, container, false);

        db = LocalDatabase.getDatabase(getContext());

        atualizarPost();

        binding.addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para adicionar um novo item
            Toast.makeText(getActivity(), "Adicionar", Toast.LENGTH_SHORT).show();
            criarPost();
            }
        });

        binding.profileImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                postes = db.postModel().pesquisaPost(binding.searchEditText.getText().toString());
                binding.listaPost.setAdapter(new PostAdapter(getContext(), postes));
            }
        });

        return binding.getRoot();
    }

    private void searchPostByTag() {
        // Lógica para pesquisar um post pela tag recebida como parâmetro


    }

    public void criarPost(){
        NavHostFragment.findNavController(this).navigate(R.id.action_navigation_home_to_addPost);
    }

    public void atualizarPost(){
        postes = db.postModel().getAll();

        binding.listaPost.setAdapter(new PostAdapter(getContext(), postes));
    }

}