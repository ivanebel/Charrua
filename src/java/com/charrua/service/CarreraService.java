package com.charrua.service;

import com.charrua.hibernate.Carrera;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Scope(value = "singleton", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Transactional
public class CarreraService extends TemplateService{
    
    public List<Carrera> listCarreras(){
        return currentSession().createCriteria(Carrera.class).list();
    }
    
    public Long saveCarrera(Carrera carrera){
        if(carrera.getIdcarrera() == null){
            return (Long)currentSession().save(carrera);
        }else{
            currentSession().saveOrUpdate(carrera);
            currentSession().flush();
            return carrera.getIdcarrera();
        }
    }

    public void deleteCarrera(Long idcarrera){
        Carrera carrera = (Carrera) currentSession().get(Carrera.class, idcarrera);
        currentSession().delete(carrera);
        currentSession().flush();
    }
}
