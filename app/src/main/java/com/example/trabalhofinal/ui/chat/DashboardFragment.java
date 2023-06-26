package com.example.trabalhofinal.ui.chat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.example.trabalhofinal.MainActivity;
import com.example.trabalhofinal.R;
import com.example.trabalhofinal.classes.database.LocalDatabase;
import com.example.trabalhofinal.classes.entities.Chat;
import com.example.trabalhofinal.databinding.FragmentDashboardBinding;

import java.util.ArrayList;
import java.util.List;

public class DashboardFragment extends Fragment {
    private LocalDatabase db;


    public static ArrayList<Chat> chats = new ArrayList<>();
    public static Chat chatC = null;

    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        db = LocalDatabase.getDatabase(getContext());
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        chats.add(new Chat("Usuario X"));
        chats.add(new Chat("Usuario Y"));
        chats.add(new Chat("Usuario Z"));

        AdapterChat adapterChat = new AdapterChat(chats, getActivity());
        ListView chats_list = binding.listChat;
        chats_list.setAdapter(adapterChat);

        chats_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                try {
                    chatC = chats.get(position);
                    NavHostFragment.findNavController(DashboardFragment.this).navigate(R.id.action_navigation_dash_to_chats);

                }catch (Exception e){}
            }
        });
    }
}