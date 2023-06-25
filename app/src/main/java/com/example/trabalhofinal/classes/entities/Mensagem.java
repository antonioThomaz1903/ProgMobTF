package com.example.trabalhofinal.classes.entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import com.example.trabalhofinal.classes.DAO.MensagemDAO;

@Entity(foreignKeys = {@ForeignKey(entity = Chat.class, parentColumns = "id", childColumns = "idChat", onDelete = ForeignKey.CASCADE, onUpdate = ForeignKey.CASCADE)})
public class Mensagem {
    @PrimaryKey
    public int id;

    public int idChat;

    public String mensagem;

    public String remetente;

    public Mensagem(){

    }
}
