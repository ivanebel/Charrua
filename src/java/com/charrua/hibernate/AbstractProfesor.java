/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.charrua.hibernate;

/**
 *
 * @author Ivan
 */
public class AbstractProfesor {
    private int idprofesor;
    private String nombre;
    private String direccion;
    private TipoProfesor tipoprofesor;

    public AbstractProfesor() {
    }

    public AbstractProfesor(int idprofesor) {
        this.idprofesor = idprofesor;
    }

    public int getIdprofesor() {
        return idprofesor;
    }

    public void setIdprofesor(int idprofesor) {
        this.idprofesor = idprofesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TipoProfesor getTipoprofesor() {
        return tipoprofesor;
    }

    public void setTipoprofesor(TipoProfesor tipoprofesor) {
        this.tipoprofesor = tipoprofesor;
    }
    
    
    
    
    
}
