package com.example.trabalhofinal.classes.entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import com.example.trabalhofinal.classes.DAO.MensagemDAO;

@Entity(foreignKeys = {@ForeignKey(entity = Chat.class, parentColumns = "id", childColumns = "idChat", onDelete = ForeignKey.CASCADE, onUpdate = ForeignKey.CASCADE)})
public class Mensagem {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private int idChat;

    private String mensagem;

    private String remetente;

    public Mensagem(){

    }

    public int getId() {
        return id;
    }

    public int getIdChat() {
        return idChat;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdChat(int idChat) {
        this.idChat = idChat;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }
}
