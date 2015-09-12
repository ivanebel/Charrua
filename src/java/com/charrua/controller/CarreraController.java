package com.charrua.controller;

import com.charrua.hibernate.Alumno;
import com.charrua.hibernate.Carrera;
import com.charrua.service.CarreraService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class CarreraController {
    
    private CarreraService carreraservice;
    
    @RequestMapping(value = "/carreras/all",method = RequestMethod.GET)
    @ResponseBody
    public List<Carrera> obtenerListaCarreras(){
        return carreraservice.listCarreras();
    }
    
    @RequestMapping(value = "/carreras/save",method = RequestMethod.POST, headers = {"Content-type=application/json"})
    @ResponseBody
    public Long guardarCarrera(@RequestBody Carrera carrera){
        return carreraservice.saveCarrera(carrera);
    }
    
    @RequestMapping(value = "/carreras/delete/{idcarrera}",method = RequestMethod.GET)
    @ResponseBody
    public void borrarCarrera(@PathVariable Long idcarrera){
        carreraservice.deleteCarrera(idcarrera);
    }
}
