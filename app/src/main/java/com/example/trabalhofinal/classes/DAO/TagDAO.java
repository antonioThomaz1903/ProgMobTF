package com.example.trabalhofinal.classes.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.trabalhofinal.classes.entities.Tag;
import com.example.trabalhofinal.classes.entities.Usuario;

@Dao
public interface TagDAO {

    @Query("SELECT * FROM Tag WHERE id = :id LIMIT 1")
    Tag getTag(int id);

    @Update
    void update(Tag tag);

    @Insert
    void insertAll(Tag... tag);

    @Delete
    void delete(Tag tag);
}
