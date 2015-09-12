/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.charrua.hibernate;

import java.io.Serializable;

public class Horario extends AbstractHorario implements Serializable{

    public Horario() {
    }

    public Horario(Long idhorario) {
        super(idhorario);
    }
    
    
    
}
