package com.example.trabalhofinal.classes.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.trabalhofinal.classes.entities.Usuario;

@Dao
public interface UsuarioDAO {

    @Query("SELECT * FROM Usuario WHERE nome = :nome LIMIT 1")
    Usuario getUsuario(String nome);


    @Update
    void update(Usuario usuario);

    @Insert
    void insertAll(Usuario... usuario);

    @Delete
    void delete(Usuario usuario);

}
