/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.boot.nomaven;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author campitos
 */
@Controller
@RequestMapping("/")
public class ControladorMensajesMongo {
  
    @Inject ServicioMensajesMongo servicio;
    
      @CrossOrigin
    @RequestMapping(value="/mensaje-mongo", method=RequestMethod.GET, headers={"Accept=application/json"})
    @ResponseBody String leerTodos()throws Exception{
        ObjectMapper maper=new ObjectMapper();
        System.out.println("ya");
         return maper.writeValueAsString(servicio.getTodos());  
        
        
    }
    
    
    @CrossOrigin
    @RequestMapping(value="/mensaje-mongo/{titulo}/{cuerpo}", 
            method=RequestMethod.GET, headers={"Accept=text/html"})
    @ResponseBody String guardar(@PathVariable String titulo, 
            @PathVariable String cuerpo)throws Exception{
        MensajeMongutio mm=new  MensajeMongutio();
        mm.setTitulo(titulo);
        mm.setCuerpo(cuerpo);
        servicio.agregarMensaje(mm);
         return "Mensaje guardado";  
        
        
    }
    
}
