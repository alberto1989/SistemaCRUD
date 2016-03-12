/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.boot.nomaven;

import java.util.ArrayList;
import org.springframework.data.annotation.Id;

/**
 *
 * @author campitos
 */
public class MensajeMongutio extends Mensaje{

    @Id
    private String idMensaje;

    public String getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(String idMensaje) {
        this.idMensaje = idMensaje;
    }
 
    
}
