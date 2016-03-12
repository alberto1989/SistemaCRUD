/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.boot.nomaven;

import java.util.ArrayList;


import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by campitos on 5/26/15.
 */

@Repository
public class MensajeMongutio extends Mensaje implements ComportamientoMensaje{
    @Inject
    MongoTemplate mongoTemplate;

    public void agregarRegistro(RegistroMensajeria registro){
        if(!mongoTemplate.collectionExists(RegistroMensajeria.class)){
            mongoTemplate.createCollection(RegistroMensajeria.class);
        }
        mongoTemplate.insert(registro);
    }

    public List<RegistroMensajeria> getTodos(){
        List<RegistroMensajeria> registros=new ArrayList<RegistroMensajeria>();
        registros=mongoTemplate.findAll(RegistroMensajeria.class);
        return registros;
    }

    @Override
    public ArrayList<Mensaje> leerTodosLosMensajes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}