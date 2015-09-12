package com.charrua.hibernate;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AbstractAlumno implements Serializable{

    @Id
    private Long idalumno;
    
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

    public AbstractAlumno(Long idalumno) {
        this.idalumno = idalumno;
    }
    
    
    public Long getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(Long idalumno) {
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
