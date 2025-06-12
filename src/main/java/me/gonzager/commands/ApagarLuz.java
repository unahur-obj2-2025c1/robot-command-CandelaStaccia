package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class ApagarLuz extends Tarea {

    private Habitacion habitacion;

    public ApagarLuz(Integer duracion, Habitacion habitacion) {
        super(duracion);
        this.habitacion = habitacion;
    }

    @Override
    public void ejecutar(Robot robot) {
        robot.reducirBateria(!habitacion.getEstaEncendida() ? 1 : 5);
        duracion = !habitacion.getEstaEncendida() ? 25 : 90;
        habitacion.setEstaEncendida(false);
    }
    

}
