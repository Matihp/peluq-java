/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluq.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;

@Entity
public class Duenio implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int duenioId;
    private String nombre;
    private String celuDuenio;

    public Duenio(int duenioId, String nombre, String celuDuenio) {
        this.duenioId = duenioId;
        this.nombre = nombre;
        this.celuDuenio = celuDuenio;
    }

    Duenio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getDuenioId() {
        return duenioId;
    }

    public void setDuenioId(int duenioId) {
        this.duenioId = duenioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCeluDuenio() {
        return celuDuenio;
    }

    public void setCeluDuenio(String celuDuenio) {
        this.celuDuenio = celuDuenio;
    }
    
    
    
}
