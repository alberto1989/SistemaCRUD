/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.boot.nomaven;

/**
 *
 * @author campitos
 */
public class PatoRobot extends Pato implements ComportamientoCuac{

    @Override
    public String hacerCuac() {
      return "cuakkk-cucucuakk";
    }
    
}
