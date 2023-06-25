package com.example.trabalhofinal.classes.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.trabalhofinal.classes.entities.Tag;

import java.util.ArrayList;

@Dao
public interface TagDAO {

    @Query("SELECT * FROM Tag WHERE nome = :nome LIMIT 1")
    Tag getTag(String nome);

    @Update
    void update(Tag tag);

    @Insert
    void insertAll(ArrayList<Tag> tag);

    @Delete
    void delete(Tag tag);
}
