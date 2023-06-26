package com.example.trabalhofinal.classes.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.trabalhofinal.classes.entities.Post;


import java.util.List;

@Dao
public interface PostDAO {


    @Query("SELECT * FROM Post WHERE id = :id LIMIT 1")
    Post getPost(int id);

    @Query("SELECT * FROM Post WHERE titulo LIKE '%' || :nome || '%'")
    List<Post> pesquisaPost(String nome);

    @Query("SELECT * FROM Post")
    List<Post> getAll();

    @Update
    void update(Post post);

    @Insert
    void insertAll(Post... post);

    @Delete
    void delete(Post post);
}
