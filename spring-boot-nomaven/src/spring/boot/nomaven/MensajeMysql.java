/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.boot.nomaven;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author campitos
 */
public class MensajeMysql extends Mensaje implements ComportamientoMensaje{

    @Override
    public ArrayList<Mensaje> leerTodosLosMensajes(){
           DAOMensaje dao=new DAOMensaje();
            ArrayList<Mensaje> mensajes=new ArrayList<Mensaje>();
        try {
         mensajes=dao.buscarTodos();
        } catch (Exception ex) {
     System.out.println(ex.getMessage());
        }
          return mensajes ;
          
    }

    @Override
    public void guardar(Mensaje m) {
        DAOMensaje dao = new DAOMensaje();
        try {
            dao.guardar(m);
        } catch (Exception ex) {
            Logger.getLogger(MensajeMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
