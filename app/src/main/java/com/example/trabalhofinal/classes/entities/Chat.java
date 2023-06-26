package com.example.trabalhofinal.classes.entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = {@ForeignKey(entity = Usuario.class, parentColumns = "nome", childColumns = "usuario", onDelete = ForeignKey.CASCADE, onUpdate = ForeignKey.CASCADE)})
public class Chat {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String usuario;

    public Chat(){

    }

    public Chat(String usuario){
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }


    public String getUsuario() {
        return usuario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
