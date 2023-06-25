package com.example.trabalhofinal.ui.configs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.trabalhofinal.classes.database.LocalDatabase;
import com.example.trabalhofinal.classes.entities.Usuario;
import com.example.trabalhofinal.databinding.FragmentNotificationsBinding;

public class NotificationsFragment extends Fragment {

    private FragmentNotificationsBinding binding;

    private LocalDatabase db;

    private TextView nome;

    private Usuario user = new Usuario("Fulanin", "0000000","67-11111-2222","fulanin@gmail.com");



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        db = LocalDatabase.getDatabase(getActivity().getApplicationContext());
        try{
            db.usuarioModel().insertAll(user);
        }
        catch(Exception e){
            System.out.println("\nJá tá la");
        }

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.descricao;
        //notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        textView.setText(db.usuarioModel().getUsuario("Fulanin").toString());

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}