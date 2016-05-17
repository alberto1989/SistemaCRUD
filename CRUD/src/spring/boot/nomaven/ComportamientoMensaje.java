/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.boot.nomaven;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author heroe1989
 */
public interface ComportamientoMensaje {
    
  public List<Mensaje>    leerTodosLosMensajes();
  public void guardar(Mensaje m);
  public Mensaje  obtenerMensajePorID(Integer id);
  public void actualizarMensaje(Mensaje m);
  public void borrarMensaje(Integer id);
  
}
