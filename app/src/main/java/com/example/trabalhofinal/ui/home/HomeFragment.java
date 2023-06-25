package com.example.trabalhofinal.ui.home;

import static android.os.Build.VERSION_CODES.R;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.trabalhofinal.classes.database.LocalDatabase;
import com.example.trabalhofinal.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;

    private LocalDatabase db;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        //db = LocalDatabase.getDatabase(getActivity().getApplicationContext());
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        ImageButton profileImageButton = binding.profileImageView;
        profileImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para abrir as configurações do usuário
                Toast.makeText(getActivity().getApplicationContext(), "Configurações do usuário", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton addButton = binding.addButton;
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para adicionar um novo item
                Toast.makeText(getActivity().getApplicationContext(), "Adicionar", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }

}