package me.gonzager.domain;

public class Habitacion {

    private Boolean estaEncendida;

    private Integer metroCuadrado;


    public Habitacion(Boolean estaEncendida, Integer metroCuadrado) {
        this.estaEncendida = estaEncendida;
        this.metroCuadrado = metroCuadrado;
    }

    public Boolean getEstaEncendida() {
        return estaEncendida;
    }

    public void setEstaEncendida(Boolean estaEncendida) {
        this.estaEncendida = estaEncendida;
    }

    public Integer getMetroCuadrado() {
        return metroCuadrado;
    }

}
