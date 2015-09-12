package com.charrua.service;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class TemplateService {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    protected Session currentSession(){
        sessionFactory.getCurrentSession().setFlushMode(FlushMode.COMMIT);
        return sessionFactory.getCurrentSession();
    }
}
