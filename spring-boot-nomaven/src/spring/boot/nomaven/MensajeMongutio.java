/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.boot.nomaven;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Repository;

/**
 *
 * @author campitos
 */
@Repository
public class MensajeMongutio extends Mensaje{
   
   
@Id
private String idd;

    /**
     * @return the id
     */
    public String getIdd() {
        return idd;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.idd = id;
    }

    

   

}
