/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.boot.nomaven;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 *
 */
@Controller
@RequestMapping("/")
public class ControladorMensaje {
    @Autowired ComportamientoMensaje miServicioMensaje;

 
    
    @CrossOrigin
    @RequestMapping(value="/mensaje", method=RequestMethod.GET, headers = {"Accept=application/json"})
    @ResponseBody String obtenerTodos()throws Exception{
     
     ObjectMapper maper=new ObjectMapper();
   List<Mensaje> mensajitos=   miServicioMensaje.leerTodosLosMensajes();
   return maper.writeValueAsString(mensajitos);
   
    }
    
    @CrossOrigin
    @RequestMapping(value="/mensaje/{id}", method=RequestMethod.GET, headers = {"Accept=application/json"})
    @ResponseBody String obtenerPorId(@PathVariable Integer id)throws Exception{
     
     ObjectMapper maper=new ObjectMapper();
   Mensaje mensajito=   miServicioMensaje.obtenerMensajePorID(id);
   return maper.writeValueAsString(mensajito);
   
    }
    
    @CrossOrigin
    @RequestMapping(value="/mensaje/{id}/{titulo}/{cuerpo}", method=RequestMethod.PUT, headers = {"Accept=text/html"})
    @ResponseBody String obtenerPorId(@PathVariable Integer id,
            @PathVariable String titulo, @PathVariable String cuerpo)throws Exception{
     Mensaje m=new Mensaje();
             m.setId(id);
             m.setTitulo(titulo);
             m.setCuerpo(cuerpo);
     miServicioMensaje.actualizarMensaje(m);
   return "Mensaje actualizado con exito";
   
    }
     
    
     @CrossOrigin
    @RequestMapping(value = "/mensaje/{titulo}/{cuerpo}",
            method = RequestMethod.POST, headers = {"Accept=text/html"})
    @ResponseBody String guardarMensaje(@PathVariable String titulo,
            @PathVariable String cuerpo) throws Exception{
        Mensaje m = new Mensaje();
        m.setTitulo(titulo);
        m.setCuerpo(cuerpo);
        miServicioMensaje.guardar(m);
        return "Mensaje guardado con exito";
        
    }
    
    
    @CrossOrigin
    @RequestMapping(value="/borrar/{id}", method=RequestMethod.DELETE, headers = {"Accept=text/html"})
    @ResponseBody String borrarMensaje (@PathVariable Integer id)throws Exception{
     
     Mensaje m = new Mensaje();
        m.setId(id);
     miServicioMensaje.borrarMensaje(id);
     return "Mensaje borrado con Exito";
   
    } 
    
    
    
}
