package me.gonzager.commands;

import me.gonzager.domain.Robot;

public class Info extends Tarea {

    public Info(Integer duracion) {
        super(duracion);
    }

    @Override
    public void ejecutar(Robot robot) {
        Integer promedio = robot.getDuracionTareas() / robot.cantTareasRealizadas();
        System.out.println("Este es el promedio de info: " + promedio);
        robot.reducirBateria(10);
        duracion = 15;
    }
}
