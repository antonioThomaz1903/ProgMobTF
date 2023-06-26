package com.example.trabalhofinal.classes.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.trabalhofinal.classes.DAO.ChatDAO;
import com.example.trabalhofinal.classes.DAO.MensagemDAO;
import com.example.trabalhofinal.classes.DAO.NotificacaoDAO;
import com.example.trabalhofinal.classes.DAO.PostDAO;
import com.example.trabalhofinal.classes.DAO.TagDAO;
import com.example.trabalhofinal.classes.DAO.UsuarioDAO;
import com.example.trabalhofinal.classes.entities.Chat;
import com.example.trabalhofinal.classes.entities.Mensagem;
import com.example.trabalhofinal.classes.entities.Notificacao;
import com.example.trabalhofinal.classes.entities.Post;
import com.example.trabalhofinal.classes.entities.Tag;
import com.example.trabalhofinal.classes.entities.Usuario;

@Database(entities = {Usuario.class, Post.class, Notificacao.class,Tag.class, Mensagem.class, Chat.class}, version = 4)
public abstract class LocalDatabase extends RoomDatabase{

    private static LocalDatabase INSTANCE;

    public static LocalDatabase getDatabase(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), LocalDatabase.class, "ControleCelulares").allowMainThreadQueries().build();
        }
        return INSTANCE;
    }

    public abstract UsuarioDAO usuarioModel();
    public abstract PostDAO postModel();
    public abstract NotificacaoDAO notificacaoModel();
    public abstract TagDAO tagModel();
    public abstract ChatDAO chatModel();
    public abstract MensagemDAO mensagemModel();
}
