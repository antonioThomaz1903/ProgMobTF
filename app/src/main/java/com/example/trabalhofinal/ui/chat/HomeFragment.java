package com.example.trabalhofinal.ui.chat;

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

import com.example.trabalhofinal.classes.database.LocalDatabase;
import com.example.trabalhofinal.classes.entities.Tag;
import com.example.trabalhofinal.databinding.FragmentHomeBinding;

import java.awt.font.NumericShaper;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    private LocalDatabase db;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        db = LocalDatabase.getDatabase(getActivity().getApplicationContext());
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    private EditText searchEditText;
    private ImageButton profileImageButton;
    private ImageButton addButton;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        searchEditText = view.findViewById(R.id.searchEditText);
        searchEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = searchEditText.getText().toString();
                Tag postTag = new Tag();
                // Lógica para pesquisar um post pela tag
                searchPostByTag(postTag);
            }
        });

        profileImageButton = view.findViewById(R.id.profileImageView);
        profileImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para abrir as configurações do usuário
                Toast.makeText(getActivity(), "Configurações do usuário", Toast.LENGTH_SHORT).show();
            }
        });

        addButton = view.findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para adicionar um novo item
                Toast.makeText(getActivity(), "Adicionar", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    private void searchPostByTag(Tag tag) {
        // Lógica para pesquisar um post pela tag recebida como parâmetro
        Toast.makeText(getActivity(), "Pesquisar post por tag: " + Tag.getNome(), Toast.LENGTH_SHORT).show();
    }
}