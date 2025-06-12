package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class Limpiar extends Tarea {

    private Habitacion habitacion;

    public Limpiar(Integer duracion, Habitacion habitacion) {
        super(duracion);
        this.habitacion = habitacion;
    }

    @Override
    public void ejecutar(Robot robot) {
        duracion = habitacion.getMetroCuadrado() * 180;
        robot.reducirBateria(habitacion.getMetroCuadrado() * 5);
    }
    

}
