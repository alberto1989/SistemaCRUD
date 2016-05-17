/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.boot.nomaven;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class DAOMensaje {
    public  SessionFactory sessionFactory;
    public  Session session;
    public  Transaction transaction;
    public DAOMensaje(){
     sessionFactory=   HibernateUtilidades.getSessionFactory();
     session=sessionFactory.openSession();
     transaction=session.beginTransaction();
    }
    private void cerrarTodo(){
        transaction.commit();
        session.close();
    }
    /*
  1.   GUARDAR
    */
    public void guardar(Mensaje obj)throws Exception{
        session.save(obj);
        cerrarTodo();
    }
/*
    2. BUSCAR TODOS
    */
    ArrayList<Mensaje> buscarTodos() throws Exception{
  ArrayList<Mensaje>objetos=  (ArrayList<Mensaje>) session.createCriteria(Mensaje.class).list();
  cerrarTodo();
  
    return objetos;
    }
    /*
   3.  BUSCAR POR ID
    */
    public Mensaje buscarPorId(Integer id) throws Exception{
 
      Mensaje    obj=(Mensaje) session.createCriteria(Mensaje.class).add(Restrictions.idEq(id)).uniqueResult();
  cerrarTodo();
  
      //   obj=(Cliente) session.createCriteria(Mensaje.class).add(Restrictions.idEq(c.getIdCliente())).uniqueResult();
         
    return obj;
    }
    /*
    4. ACTUALIZAR
    */
    public void actualizar(Mensaje obj)throws Exception{
        

       
         session.update(obj);
         cerrarTodo();
        
    }
    /*
    5. BORRAR
    */
     public void   borrar(Integer id)throws Exception{
        
Mensaje obj=new Mensaje();
        obj.setId(id); 
         session.delete(obj);
         cerrarTodo();
         
    }
    
    
    
}   