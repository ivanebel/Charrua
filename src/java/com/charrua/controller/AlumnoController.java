package com.charrua.controller;

import com.charrua.hibernate.Alumno;
import com.charrua.service.AlumnoService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class AlumnoController {
    
    private AlumnoService alumnoservice;
    
    @RequestMapping(value = "/alumnos/all",method = RequestMethod.GET)
    @ResponseBody
    public List<Alumno> obtenerListaAlumnos(){
        return alumnoservice.listAlumnos();
    }
    
    @RequestMapping(value = "/alumnos/save",method = RequestMethod.POST, headers = {"Content-type=application/json"})
    @ResponseBody
    public Long guardarAlumno(@RequestBody Alumno alumno){
        return alumnoservice.saveAlumno(alumno);
    }
    
    @RequestMapping(value = "/alumnos/delete/{idalumno}",method = RequestMethod.GET)
    @ResponseBody
    public void borrarAlumno(@PathVariable Long idalumno){
        alumnoservice.deleteAlumno(idalumno);
    }
    
}
