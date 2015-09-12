/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.charrua.hibernate;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

/**
 *
 * @author Ivan
 */
public class AbstractCarrera implements Serializable {
    
    @Id
    private int idcarrera;
    
    @Column
    private String nombre;
    
    @Column
    private String descripcion;
    
    @OneToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinTable( name = "carreramaterias" )
    private List<Materia> materias;

    public AbstractCarrera() {
    }

    public AbstractCarrera(int idcarrera) {
        this.idcarrera = idcarrera;
    }

    public int getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(int idcarrera) {
        this.idcarrera = idcarrera;
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

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
    
    
}
