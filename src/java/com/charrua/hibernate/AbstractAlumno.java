/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.charrua.hibernate;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;


/**
 *
 * @author Ivan
 */

public class AbstractAlumno implements Serializable{

    @Id
    private int idalumno;
    
    @Column
    private String nombre;
    
    @Column
    private String dni;
    
    @Column
    private String direccion;
    
    @Column
    private String telefono;
    
    @Column
    private String email;

    public AbstractAlumno() {
    }

    public AbstractAlumno(int idalumno) {
        this.idalumno = idalumno;
    }
    
    
    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
