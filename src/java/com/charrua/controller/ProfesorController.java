package com.charrua.controller;

import com.charrua.hibernate.Carrera;
import com.charrua.hibernate.Profesor;
import com.charrua.service.ProfesorService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class ProfesorController {

    private ProfesorService profesorservice;
    
    @RequestMapping(value = "/profesores/all",method = RequestMethod.GET)
    @ResponseBody
    public List<Profesor> obtenerListaProfesores(){
        return profesorservice.listProfesor();
    }
    
    @RequestMapping(value = "/profesores/save",method = RequestMethod.POST, headers = {"Content-type=application/json"})
    @ResponseBody
    public Long guardarProfesor(@RequestBody Profesor profesor){
        return profesorservice.saveProfesor(profesor);
    }
    
    @RequestMapping(value = "/profesores/delete/{idprofesor}",method = RequestMethod.GET)
    @ResponseBody
    public void borrarCarrera(@PathVariable Long idprofesor){
        profesorservice.deleteProfesor(idprofesor);
    }
}
