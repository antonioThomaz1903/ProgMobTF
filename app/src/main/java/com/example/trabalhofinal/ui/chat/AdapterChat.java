package com.example.trabalhofinal.ui.chat;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.trabalhofinal.R;
import com.example.trabalhofinal.classes.entities.Chat;

import java.util.List;

public class AdapterChat extends BaseAdapter {

    private List<Chat> chat_list;
    private Activity act;

    public AdapterChat(List<Chat> chat_list, Activity act){
        this.act = act;
        this.chat_list = chat_list;
    }

    @Override
    public int getCount() {
        return chat_list.size();
    }

    @Override
    public Chat getItem(int position) {
        return chat_list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return chat_list.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater().inflate(R.layout.list_chats, parent, false);
        TextView txt = view.findViewById(R.id.txt_chat_list);
        txt.setText(getItem(position).getUsuario());
        return view;
    }
}
