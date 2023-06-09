package com.example.trabalhofinal.classes.entities;


import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(
        foreignKeys = @ForeignKey(entity = Usuario.class,
        parentColumns = "nome", childColumns = "postador",
        onDelete = ForeignKey.CASCADE)
)
public class Post {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String postador;
    private String titulo;
    private String descricao;

    public Post(){}

    public Post(int id, String postador, String titulo, String descrica) {
        this.id = id;
        this.postador = postador;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Post( String postador, String titulo, String descricao) {
        this.postador = postador;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostador() {
        return postador;
    }

    public void setPostador(String postador) {
        this.postador = postador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", postador='" + postador + '\'' +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
