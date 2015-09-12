package com.charrua.service;

import com.charrua.hibernate.Materia;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Scope(value = "singleton", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Transactional
public class MateriaService extends TemplateService{
 
    public List<Materia> listMaterias(){
        return currentSession().createCriteria(Materia.class).list();
    }
    
    public Long saveMateria(Materia materia){
        if(materia.getIdmateria() == null){
            return (Long)currentSession().save(materia);
        }else{
            currentSession().saveOrUpdate(materia);
            currentSession().flush();
            return materia.getIdmateria();
        }
    }

    public void deleteMateria(Long idmateria){
        Materia materia = (Materia) currentSession().get(Materia.class, idmateria);
        currentSession().delete(materia);
        currentSession().flush();
    }
    
}
