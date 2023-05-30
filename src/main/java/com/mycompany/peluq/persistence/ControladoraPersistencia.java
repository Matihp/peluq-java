/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluq.persistence;

import com.mycompany.peluq.logic.Duenio;
import com.mycompany.peluq.logic.Mascota;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Matias
 */
public class ControladoraPersistencia {
    DuenioJpaController dueJpa= new DuenioJpaController();
    MascotaJpaController masJpa= new MascotaJpaController();

    public void guardar(Duenio due, Mascota mas) {
        dueJpa.create(due);
        masJpa.create(mas);
        
       // JOptionPane optionPane = new JOptionPane("Se guardo correctamente");
        //optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        //JDialog dialog = optionPane.createDialog("Guardado exitoso");
        //dialog.setAlwaysOnTop(true);
        //dialog.setVisible(true);
       
    }
}
