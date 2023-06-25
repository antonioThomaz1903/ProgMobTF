package com.example.trabalhofinal.classes.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.trabalhofinal.classes.DAO.NotificacaoDAO;
import com.example.trabalhofinal.classes.DAO.PostDAO;
import com.example.trabalhofinal.classes.DAO.TagDAO;
import com.example.trabalhofinal.classes.DAO.UsuarioDAO;

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
}
