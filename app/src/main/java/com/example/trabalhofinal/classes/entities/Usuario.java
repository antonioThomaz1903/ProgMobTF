package com.example.trabalhofinal.classes.entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;

@Entity
public class Usuario {
    @PrimaryKey
    @NonNull
    private String nome;

    private String senha;

    private String relefone;

    private String email;

    public Usuario(String nome, String senha, String relefone, String email) {
        this.nome = nome;
        this.senha = senha;
        this.relefone = relefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getRelefone() {
        return relefone;
    }

    public void setRelefone(String relefone) {
        this.relefone = relefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", relefone='" + relefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
