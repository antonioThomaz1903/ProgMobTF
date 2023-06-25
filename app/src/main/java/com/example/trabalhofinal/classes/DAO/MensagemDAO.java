package com.example.trabalhofinal.classes.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.trabalhofinal.classes.entities.Mensagem;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface MensagemDAO {
    @Query("SELECT * FROM Mensagem")
    List<Mensagem> getAll();

    @Query("SELECT * FROM Mensagem WHERE idChat = :id")
    List<Mensagem> getMessagesByChatId(int id);

    @Query("SELECT * FROM Mensagem WHERE id = :id")
    Mensagem getMessageById(int id);

    @Update
    void update(Mensagem mensagem);

    @Delete
    void delete(Mensagem mensagem);

    @Insert
    void insertAll(Mensagem... mensagens);

}
