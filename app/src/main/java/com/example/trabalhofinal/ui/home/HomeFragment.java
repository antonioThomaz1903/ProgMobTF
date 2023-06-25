package com.example.trabalhofinal.ui.home;

import static android.os.Build.VERSION_CODES.R;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.example.trabalhofinal.R;
import com.example.trabalhofinal.classes.database.LocalDatabase;
import com.example.trabalhofinal.classes.entities.Tag;
import com.example.trabalhofinal.databinding.FragmentHomeBinding;
import java.awt.font.NumericShaper;


public class HomeFragment extends Fragment {
    private com.example.trabalhofinal.databinding.FragmentHomeBinding binding;

    private boolean status = false;

    private EditText searchEditText;
    private ImageButton profileImageButton;
    private ImageButton addButton;

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
        searchEditText = binding.searchEditText;
        searchEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = searchEditText.getText().toString();
                Tag postTag = new Tag();
                // Lógica para pesquisar um post pela tag
                searchPostByTag(postTag);
            }
        });

        profileImageButton = binding.profileImageView;

        ImageButton profileImageButton = binding.profileImageView;
        profileImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Configurações do usuário", Toast.LENGTH_SHORT).show();
            }
        });

        addButton = binding.addButton;
                Toast.makeText(getActivity().getApplicationContext(), "Configurações do usuário", Toast.LENGTH_SHORT).show();

        ImageButton addButton = binding.addButton;
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para adicionar um novo item
            Toast.makeText(getActivity(), "Adicionar", Toast.LENGTH_SHORT).show();
            }
        });

        return binding.getRoot();
    }

    private void searchPostByTag(Tag tag) {
        // Lógica para pesquisar um post pela tag recebida como parâmetro
        Toast.makeText(getActivity(), "Pesquisar post por tag: " + db.tagModel().getTag("CACHORRO").getNome(), Toast.LENGTH_SHORT).show();
                Toast.makeText(getActivity().getApplicationContext(), "Adicionar", Toast.LENGTH_SHORT).show();
                criarPost();

    }

    public void criarPost(){
        NavHostFragment.findNavController(HomeFragment.this).navigate(com.example.trabalhofinal.R.id.action_navigation_home_to_criarPost);
    }

}