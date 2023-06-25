package com.example.trabalhofinal.classes.entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(
        foreignKeys = @ForeignKey(entity = Tag.class,
                parentColumns = "id", childColumns = "requisito",
                onDelete = ForeignKey.CASCADE)
)
public class Tag {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nome;
    private int requisito;

    public Tag(){}

    public Tag(int id, String nome, int requisito) {
        this.id = id;
        this.nome = nome;
        this.requisito = requisito;
    }
    public Tag(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRequisito() {
        return requisito;
    }

    public void setRequisito(int requisito) {
        this.requisito = requisito;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", requisito=" + requisito +
                '}';
    }
}

