/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.boot.nomaven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author campitos
 */
@Configuration
public class ConfigurarServicios {
    @Bean 
    public ComportamientoCuac miServicio(){
               return new PatoRobot();
            }
    
    @Bean
    public ComportamientoMensaje miServicioMensaje(){
        return new MensajeSerializado();
    }
            
    
}
