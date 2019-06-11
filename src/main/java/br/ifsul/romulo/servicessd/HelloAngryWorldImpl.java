/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifsul.romulo.servicessd;

import javax.jws.WebService;

/**
 * @author learninjava.com
 * @see www.learninjava.com
 */
@WebService(endpointInterface = "br.ifsul.romulo.servicessd.HelloAngryWorld")
public class HelloAngryWorldImpl implements HelloAngryWorld {

 
    public String sayHi(String text) {
        System.out.println("sayHi called");
        return "Hello " + text;
    }

 

}
