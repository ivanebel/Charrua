/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.charrua.hibernate;

import java.io.Serializable;

/**
 *
 * @author Ivan
 */
public class AbstractTipoProfesor implements Serializable{
    private int idtipoprofesor;
    private String nombre;
    private String descripcion;

    public AbstractTipoProfesor() {
    }

    public AbstractTipoProfesor(int idtipoprofesor) {
        this.idtipoprofesor = idtipoprofesor;
    }

    public int getIdtipoprofesor() {
        return idtipoprofesor;
    }

    public void setIdtipoprofesor(int idtipoprofesor) {
        this.idtipoprofesor = idtipoprofesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
