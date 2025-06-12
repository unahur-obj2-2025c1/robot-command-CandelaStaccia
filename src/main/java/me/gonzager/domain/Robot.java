package me.gonzager.domain;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.commands.Tarea;

//invocador seria el test o main donde se prueba (seria el cliente que ejecuta lo implementado y ve la respuesta de todo lo que se hizo: estado del orden y robot)
public class Robot { //receptor; maneja las tareas
    private Double nivelBateria = 0.00;
    private List<Tarea> tareasEjecutadas = new ArrayList<>();
    

    
    public Integer maximaCargaMinutos() {
        return 125; //como es constante se pone como metodo
    } //final private Integer maximaCargaMinutos = 125; seria como constante

    public void reducirBateria(Integer valor) {
        if (valor > nivelBateria) {
            throw new IllegalArgumentException("La bateria no puede ser negativa");
        } //si tira la excepcion, se termina la ejecucion
        nivelBateria = nivelBateria - valor;
    }

    public Double getNivelBateria() {
        return nivelBateria;
    }

    public List<Tarea> getTareasEjecutadas() {
        return tareasEjecutadas;
    }

    public Double segundosRestantesDeBateria() {
        return 100 / this.maximaCargaMinutos() * nivelBateria;
    }

    public void cargarBateria(Double valor) {
        nivelBateria = nivelBateria + (valor * 100 / this.maximaCargaMinutos());
        nivelBateria = Math.min(100, nivelBateria); //si la cuenta se pasa del 100, se controla con el min
    }

    public Integer getDuracionTareas() {
        return tareasEjecutadas.stream().mapToInt(t -> t.getDuracion()).sum();
    }

    public void agregarTarea(Tarea tarea) {
        tareasEjecutadas.add(tarea);
    }

    public void borrarTarea(Tarea tarea) {
        tareasEjecutadas.remove(tarea);
    }

    public Integer cantTareasRealizadas() {
        return tareasEjecutadas.size();
    }



////////////////////////////////////////////////////////////////////
    

    public void ejecutarTareas() {
        
    }

    
}
