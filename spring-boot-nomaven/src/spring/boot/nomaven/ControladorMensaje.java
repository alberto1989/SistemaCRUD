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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author campitos
 */
@Controller
@RequestMapping("/")
public class ControladorMensaje {
    @Autowired ComportamientoMensaje miServicioMensaje;
    @Inject ServicioMensajesMongo mensajesMongo;
 
    
    @CrossOrigin
    @RequestMapping(value="/mensaje", method=RequestMethod.GET, headers = {"Accept=application/json"})
    @ResponseBody String obtenerTodos()throws Exception{
     
     ObjectMapper maper=new ObjectMapper();
   List<Mensaje> mensajitos=   miServicioMensaje.leerTodosLosMensajes();
   return maper.writeValueAsString(mensajitos);
   
    }
    
    
       @CrossOrigin
    @RequestMapping(value="/mensajemongo", method=RequestMethod.GET, headers = {"Accept=text/html"})
    @ResponseBody String guardar()throws Exception{
     MensajeMongutio m=new MensajeMongutio();
     m.setCuerpo("yaaa");
     m.setTitulo("malo");
    mensajesMongo.agregarMensaje(m);
     return "Guardado con exito";
    }
    
    
    
    
    
}
