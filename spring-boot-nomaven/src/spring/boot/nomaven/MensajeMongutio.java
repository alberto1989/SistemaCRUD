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
public class MensajeMongutio{
   
   
@Id
private String id;

private String titulo;
private String cuerpo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    

   

}
