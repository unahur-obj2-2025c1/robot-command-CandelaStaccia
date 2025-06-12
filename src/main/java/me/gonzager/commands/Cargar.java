package me.gonzager.commands;

import me.gonzager.domain.Robot;

public class Cargar extends Tarea {

    public Cargar(Integer duracion) {
        super(duracion);
    }

    @Override
    public void ejecutar(Robot robot) {
        var minutosTardados = robot.maximaCargaMinutos() - robot.segundosRestantesDeBateria()*60; //cuantos minutos carga
        robot.cargarBateria(minutosTardados);
    }
    

}
