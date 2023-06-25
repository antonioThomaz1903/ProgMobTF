package com.example.trabalhofinal.classes.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.trabalhofinal.classes.entities.Chat;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface ChatDAO {
    @Query("SELECT * FROM Chat")
    List<Chat> getAll();

    @Query("SELECT * FROM Chat WHERE usuario = :usuario LIMIT 1")
    Chat getChatByUser(String usuario);

    @Update
    void update(Chat chat);

    @Delete
    void delete(Chat chat);

    @Insert
    void insertAll(Chat... chats);

}
