package com.charrua.controller;

import com.charrua.hibernate.Materia;
import com.charrua.service.MateriaService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class MateriaController {
    
    private MateriaService materiaservice;
    
    @RequestMapping(value = "/materias/all",method = RequestMethod.GET)
    @ResponseBody
    public List<Materia> obtenerListaMaterias(){
        return materiaservice.listMaterias();
    }
    
    @RequestMapping(value = "/materias/save",method = RequestMethod.POST, headers = {"Content-type=application/json"})
    @ResponseBody
    public Long guardarMateria(@RequestBody Materia materia){
        return materiaservice.saveMateria(materia);
    }
    
    @RequestMapping(value = "/materias/delete/{idmateria}",method = RequestMethod.GET)
    @ResponseBody
    public void borrarMateria(@PathVariable Long idmateria){
        materiaservice.deleteMateria(idmateria);
    }
    

}
