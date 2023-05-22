/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluq.logic;

import com.mycompany.peluq.persistence.ControladoraPersistencia;

/**
 *
 * @author Matias
 */
public class Controladora {
    ControladoraPersistencia controlPer = new ControladoraPersistencia();

    public void guardar(String nombre, String nombreDuenio, String celDueño, String color, String raza, String observaciones, String alergia, String atencion) {
       Duenio due = new Duenio();
       due.setNombre(nombreDuenio); 
    }
    
   
}
