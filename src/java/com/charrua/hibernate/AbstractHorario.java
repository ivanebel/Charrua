/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.charrua.hibernate;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Ivan
 */
@Entity
public class AbstractHorario implements Serializable{
    
    @Id
    private int idhorario;
    
    @Column
    private int dia;
    
    @Column
    private int horainicio;
    
    @Column
    private int horafin;

    public AbstractHorario() {
    }

    public AbstractHorario(int idhorario) {
        this.idhorario = idhorario;
    }

    public int getIdhorario() {
        return idhorario;
    }

    public void setIdhorario(int idhorario) {
        this.idhorario = idhorario;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(int horainicio) {
        this.horainicio = horainicio;
    }

    public int getHorafin() {
        return horafin;
    }

    public void setHorafin(int horafin) {
        this.horafin = horafin;
    }
    
    
}
