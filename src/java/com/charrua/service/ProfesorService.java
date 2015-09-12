package com.charrua.service;

import com.charrua.hibernate.Profesor;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Scope(value = "singleton", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Transactional
public class ProfesorService extends TemplateService{
    
    public List<Profesor> listProfesor(){
         return currentSession().createCriteria(Profesor.class).list();
    }
    
    public Long saveProfesor(Profesor profesor){
        if(profesor.getIdprofesor() == null){
            return (Long)currentSession().save(profesor);
        }else{
            currentSession().saveOrUpdate(profesor);
            currentSession().flush();
            return profesor.getIdprofesor();
        }
    }

    public void deleteProfesor(Long idprofesor){
        Profesor profesor = (Profesor) currentSession().get(Profesor.class, idprofesor);
        currentSession().delete(profesor);
        currentSession().flush();
    }
    
}
