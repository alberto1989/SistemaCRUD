/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.boot.nomaven;

import java.util.ArrayList;

/**
 *
 * @author campitos
 */
public class MensajeMysql extends Mensaje implements ComportamientoMensaje{

    @Override
    public ArrayList<Mensaje> leerTodosLosMensajes() {
            //  DAOMensaje
            return null;
    }
    
}
