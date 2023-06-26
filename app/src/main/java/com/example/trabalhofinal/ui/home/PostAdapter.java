package com.example.trabalhofinal.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.trabalhofinal.R;
import com.example.trabalhofinal.classes.entities.Post;

import java.util.List;

public class PostAdapter extends ArrayAdapter<Post> {

    public PostAdapter(Context context, List<Post> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Verifica se a view já existe
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listpost, parent, false);
        }

        // Obtém o item da lista na posição atual
        Post currentItem = getItem(position);

        // Obtém as referências para os elementos de layout
        ImageView cardImageView = convertView.findViewById(R.id.cardImageView);
        TextView cardTitleTextView = convertView.findViewById(R.id.cardTitleTextView);
        TextView cardDescriptionTextView = convertView.findViewById(R.id.cardDescriptionTextView);

        // Define os valores dos elementos de layout com base no item atual
        cardImageView.setImageResource(R.drawable.baseline_pets_24);
        cardTitleTextView.setText(currentItem.getTitulo());
        cardDescriptionTextView.setText(currentItem.getDescricao());

        return convertView;
    }
}
