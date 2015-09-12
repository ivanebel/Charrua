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

@Entity
public class AbstractTipoProfesor implements Serializable{
    
    @Id
    private Long idtipoprofesor;
    
    @Column
    private String nombre;
    
    @Column
    private String descripcion;

    public AbstractTipoProfesor() {
    }

    public AbstractTipoProfesor(Long idtipoprofesor) {
        this.idtipoprofesor = idtipoprofesor;
    }

    public Long getIdtipoprofesor() {
        return idtipoprofesor;
    }

    public void setIdtipoprofesor(Long idtipoprofesor) {
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
