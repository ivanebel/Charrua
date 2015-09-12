/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.charrua.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class AbstractProfesor {
    
    @Id
    private Long idprofesor;
    
    @Column
    private String nombre;
    
    @Column
    private String direccion;
    
    @OneToOne
    private TipoProfesor tipoprofesor;

    
    public AbstractProfesor() {
    }

    public AbstractProfesor(Long idprofesor) {
        this.idprofesor = idprofesor;
    }

    public Long getIdprofesor() {
        return idprofesor;
    }

    public void setIdprofesor(Long idprofesor) {
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
