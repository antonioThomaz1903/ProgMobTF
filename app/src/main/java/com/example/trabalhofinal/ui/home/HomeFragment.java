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

import com.example.trabalhofinal.classes.database.LocalDatabase;
import com.example.trabalhofinal.classes.entities.Tag;
import com.example.trabalhofinal.databinding.FragmentHomeBinding;

<<<<<<< HEAD:app/src/main/java/com/example/trabalhofinal/ui/chat/HomeFragment.java
import java.awt.font.NumericShaper;


public class HomeFragment extends Fragment {

=======
public class HomeFragment extends Fragment {
>>>>>>> d96a0afbebac9193aea918203e1c1ae852f962bc:app/src/main/java/com/example/trabalhofinal/ui/home/HomeFragment.java
    private FragmentHomeBinding binding;

    private LocalDatabase db;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        //db = LocalDatabase.getDatabase(getActivity().getApplicationContext());
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

<<<<<<< HEAD:app/src/main/java/com/example/trabalhofinal/ui/chat/HomeFragment.java
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
=======
        ImageButton profileImageButton = binding.profileImageView;
>>>>>>> d96a0afbebac9193aea918203e1c1ae852f962bc:app/src/main/java/com/example/trabalhofinal/ui/home/HomeFragment.java
        profileImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para abrir as configurações do usuário
<<<<<<< HEAD:app/src/main/java/com/example/trabalhofinal/ui/chat/HomeFragment.java
                Toast.makeText(getActivity(), "Configurações do usuário", Toast.LENGTH_SHORT).show();
            }
        });

        addButton = view.findViewById(R.id.addButton);
=======
                Toast.makeText(getActivity().getApplicationContext(), "Configurações do usuário", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton addButton = binding.addButton;
>>>>>>> d96a0afbebac9193aea918203e1c1ae852f962bc:app/src/main/java/com/example/trabalhofinal/ui/home/HomeFragment.java
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para adicionar um novo item
<<<<<<< HEAD:app/src/main/java/com/example/trabalhofinal/ui/chat/HomeFragment.java
                Toast.makeText(getActivity(), "Adicionar", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    private void searchPostByTag(Tag tag) {
        // Lógica para pesquisar um post pela tag recebida como parâmetro
        Toast.makeText(getActivity(), "Pesquisar post por tag: " + Tag.getNome(), Toast.LENGTH_SHORT).show();
=======
                Toast.makeText(getActivity().getApplicationContext(), "Adicionar", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
>>>>>>> d96a0afbebac9193aea918203e1c1ae852f962bc:app/src/main/java/com/example/trabalhofinal/ui/home/HomeFragment.java
    }

}