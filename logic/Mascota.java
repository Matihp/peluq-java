/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluq.logic;

/**
 *
 * @author Matias
 */
public class Mascota {
    
    private int num_cliente;
    private String nombre;
    private String color;
    private String raza;
    private String atencion_especial;
    private String alergico;
    private String observaciones;
    
    private Duenio elDuenio;

    public Mascota(int num_cliente, String nombre, String color, String raza, String atencion_especial, String alergico, String observaciones, Duenio elDuenio) {
        this.num_cliente = num_cliente;
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.atencion_especial = atencion_especial;
        this.alergico = alergico;
        this.observaciones = observaciones;
        this.elDuenio = elDuenio;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getElDuenio() {
        return elDuenio;
    }

    public void setElDuenio(Duenio elDuenio) {
        this.elDuenio = elDuenio;
    }
    
    
    
}
