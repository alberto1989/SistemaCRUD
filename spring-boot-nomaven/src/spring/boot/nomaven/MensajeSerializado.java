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
public class MensajeSerializado extends Mensaje implements ComportamientoMensaje{

    @Override
    public ArrayList<Mensaje> leerTodosLosMensajes() {
       Mensaje m1=new Mensaje();
       m1.setTitulo("primer mensaje serializado");
       m1.setCuerpo("Puerco del primer serializado");
       
        Mensaje m2=new Mensaje();
       m2.setTitulo("segundo mensaje serializado");
       m2.setCuerpo("Puerca del primer serializado");
       
       ArrayList<Mensaje> mensajitos=new ArrayList<Mensaje>();
       mensajitos.add(m1);
        mensajitos.add(m2);
        return mensajitos;
    }

    @Override
    public void guardar(Mensaje m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
