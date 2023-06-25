package com.example.trabalhofinal.classes.entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = {@ForeignKey(entity = Usuario.class, parentColumns = "nome", childColumns = "usuario", onDelete = ForeignKey.CASCADE, onUpdate = ForeignKey.CASCADE)})
public class Chat {
    @PrimaryKey
    public int id;

    public String usuario;

    public Chat(){

    }

}
