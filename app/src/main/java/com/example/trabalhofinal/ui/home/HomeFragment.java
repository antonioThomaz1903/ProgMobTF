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

import com.example.trabalhofinal.databinding.FragmentHomeBinding;

import java.awt.font.NumericShaper;

public class HomeFragment extends AppCompatActivity {

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