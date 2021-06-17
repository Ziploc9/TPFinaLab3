package com.company;
import Herramientas.*;
import Inventario.*;
import Personaje.*;

public class Box {
    private Inventario inventario;
    private Personaje personaje;
    private Azada azada;
    private CaniaDePescar caniaDePescar;
    private Escudo escudo;
    private Espada espada;
    private Hacha hacha;
    private Pico pico;

    public Box(Inventario inventario, Personaje personaje, Azada azada, CaniaDePescar caniaDePescar, Escudo escudo, Espada espada, Hacha hacha, Pico pico) {
        this.inventario = inventario;
        this.personaje = personaje;
        this.azada = azada;
        this.caniaDePescar = caniaDePescar;
        this.escudo = escudo;
        this.espada = espada;
        this.hacha = hacha;
        this.pico = pico;
    }

    public Box(){

    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public Azada getAzada() {
        return azada;
    }

    public void setAzada(Azada azada) {
        this.azada = azada;
    }

    public CaniaDePescar getCaniaDePescar() {
        return caniaDePescar;
    }

    public void setCaniaDePescar(CaniaDePescar caniaDePescar) {
        this.caniaDePescar = caniaDePescar;
    }

    public Escudo getEscudo() {
        return escudo;
    }

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }

    public Espada getEspada() {
        return espada;
    }

    public void setEspada(Espada espada) {
        this.espada = espada;
    }

    public Hacha getHacha() {
        return hacha;
    }

    public void setHacha(Hacha hacha) {
        this.hacha = hacha;
    }

    public Pico getPico() {
        return pico;
    }

    public void setPico(Pico pico) {
        this.pico = pico;
    }
}
