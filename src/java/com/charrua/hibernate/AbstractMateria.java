package com.charrua.hibernate;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;


@Entity
public class AbstractMateria implements Serializable{
    
    @Id
    private int idmateria;
    
    @Column
    private String nombre;
    
    @Column
    private String descripcion;
    
    @Column
    private int cargahoraria;
    
    @OneToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinTable( name = "materiahorarios" )
    private List<Horario> horarios;
    
    @OneToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinTable( name = "materiaprofesores" )
    private List<Profesor> profesores;
    
    @OneToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinTable( name = "materiaalumnos" )
    private List<Alumno> alumnos;


    public AbstractMateria() {
    }
    
    public AbstractMateria(int idmateria){
        this.idmateria = idmateria;
    }

    public int getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(int idmateria) {
        this.idmateria = idmateria;
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

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }
    
    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    
    
}
