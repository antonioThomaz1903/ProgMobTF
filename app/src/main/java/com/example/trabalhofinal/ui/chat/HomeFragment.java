package com.example.trabalhofinal.ui.chat;

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

import java.awt.font.NumericShaper;

<<<<<<< HEAD:app/src/main/java/com/example/trabalhofinal/ui/home/HomeFragment.java
public class HomeFragment extends AppCompatActivity {
=======
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
>>>>>>> 538144cc8df459d738d26b49968deffd7c6d0b8e:app/src/main/java/com/example/trabalhofinal/ui/chat/HomeFragment.java




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        ImageButton profileImageButton = findViewById(R.id.profileImageView);
        profileImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para abrir as configurações do usuário
                Toast.makeText(HomeFragment.this, "Configurações do usuário", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para adicionar um novo item
                Toast.makeText(HomeFragment.this, "Adicionar", Toast.LENGTH_SHORT).show();
            }
        });
    }
}