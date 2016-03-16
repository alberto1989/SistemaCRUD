/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.boot.nomaven;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/**
 *
 * @author campitos
 */
public class MongoCero {
    public MongoCero() {
    }

    public Mensaje buscarPorLogin(String login) {
        Mensaje p = new Mensaje();
        MongoClient mongoClient = null;

        try {
            mongoClient = new MongoClient(new MongoClientURI("mongodb://campitos:raton@ds035563.mongolab.com:35563/unitec"));
            DB e = mongoClient.getDB("unitec");
            DBCollection collection = e.getCollection("profesor");
                             
              
            BasicDBObject query = new BasicDBObject("login", login);
            DBObject objeto = collection.findOne(query);
            String pas = (String)objeto.get("password");
            String logino = (String)objeto.get("login");
            System.out.println("Hasta aqui todo va bien:" + pas);
            if(pas != null) {
                //p.setLogin(logino);
                //p.setPassword(pas);
            } else {
                p = null;
            }
        } catch (Exception var10) {
            System.out.println("algo malo:" + var10.getMessage());
        }

        return p;
    }
}
