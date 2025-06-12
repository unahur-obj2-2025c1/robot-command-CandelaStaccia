package me.gonzager.commands;

import me.gonzager.domain.Robot;

public abstract class Tarea  { //orden del diagrama; orden concreta es cada tarea
    protected Integer duracion = 0; //protected p/ q accedan las hijas

    public Tarea(Integer duracion) {
        if(duracion <= 0) {
            throw new IllegalArgumentException("La duración debe ser mayor a 0");
        }
        this.duracion = duracion;
    }

    public abstract void ejecutar(Robot robot);
    //ejecutar se redefine en todos los demas

    public Integer getDuracion() {
        return duracion;
    }

}
