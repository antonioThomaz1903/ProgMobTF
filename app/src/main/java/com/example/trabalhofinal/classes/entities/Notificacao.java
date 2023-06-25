package com.example.trabalhofinal.classes.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Notificacao {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String conteudo;
    private String dataHora;

    public Notificacao(){}

    public Notificacao(int id, String conteudo, String dataHora) {
        this.id = id;
        this.conteudo = conteudo;
        this.dataHora = dataHora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Notificacao{" +
                "id=" + id +
                ", conteudo='" + conteudo + '\'' +
                ", dataHora='" + dataHora + '\'' +
                '}';
    }
}
