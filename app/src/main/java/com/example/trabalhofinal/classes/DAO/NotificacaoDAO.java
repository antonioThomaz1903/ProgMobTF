package com.example.trabalhofinal.classes.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.trabalhofinal.classes.entities.Notificacao;

@Dao
public interface NotificacaoDAO {

    @Query("SELECT * FROM Notificacao WHERE id = :id LIMIT 1")
    Notificacao getNotificacao(int id);

    @Update
    void update(Notificacao notificacao);

    @Insert
    void insertAll(Notificacao... notificacao);

    @Delete
    void delete(Notificacao notificacao);

}
