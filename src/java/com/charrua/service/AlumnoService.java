package com.charrua.service;


import com.charrua.hibernate.Alumno;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Scope(value = "singleton", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Transactional
public class AlumnoService extends TemplateService{
    
    public List<Alumno> listAlumnos(){
        return currentSession().createCriteria(Alumno.class).list();
    }
    
    public Long saveAlumno(Alumno alumno){
        if(alumno.getIdalumno() == null){
            return (Long)currentSession().save(alumno);
        }else{
            currentSession().saveOrUpdate(alumno);
            currentSession().flush();
            return alumno.getIdalumno();
        }
    }

    public void deleteAlumno(Long idalumno){
        Alumno alumno = (Alumno) currentSession().get(Alumno.class, idalumno);
        currentSession().delete(alumno);
        currentSession().flush();
    }
}
