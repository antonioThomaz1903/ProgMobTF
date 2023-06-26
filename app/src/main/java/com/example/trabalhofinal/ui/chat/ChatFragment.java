package com.example.trabalhofinal.ui.chat;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.trabalhofinal.MainActivity;
import com.example.trabalhofinal.R;
import com.example.trabalhofinal.classes.database.LocalDatabase;
import com.example.trabalhofinal.classes.entities.Chat;
import com.example.trabalhofinal.classes.entities.Mensagem;
import com.example.trabalhofinal.databinding.FragmentChatBinding;

import java.util.ArrayList;
import java.util.List;

public class ChatFragment extends Fragment {

    FragmentChatBinding binding;
    LocalDatabase db;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentChatBinding.inflate(inflater, container, false);

        View root = binding.getRoot();
        db = LocalDatabase.getDatabase(getContext());
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Chat clicado = DashboardFragment.chatC;
        binding.txtUsuarioChat.setText(clicado.getUsuario());

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_dropdown_item_1line);

        binding.btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensagemD = binding.edtMensagem.getText().toString();
                Mensagem msg =  new Mensagem();
                msg.setMensagem(mensagemD);
                msg.setRemetente(MainActivity.user.getNome());
                msg.setIdChat(clicado.getId());
                adapter.add(msg.getRemetente() + ": " + msg.getMensagem());
                binding.listMensagem.setAdapter(adapter);
            }
        });

        binding.btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

    }
}