package com.example.dm2.golscore;

public class Club {

    private long Id;
    private String Nombre;

    public Club() {
    }

    public Club(long id, String nombre) {
        this.Id = id;
        this.Nombre = nombre;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        this.Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
