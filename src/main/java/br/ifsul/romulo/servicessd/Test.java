/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifsul.romulo.servicessd;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 *
 * @author romulo
 */
public class Test {

    public static void main(String[] args) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(HelloAngryWorld.class);
        factory.setAddress("http://localhost:8080/jaxws-service/HelloAngryWorld");
        HelloAngryWorld client = (HelloAngryWorld) factory.create();
        String reply = client.sayHi("Romulo");
        System.out.println("Server said: " + reply);
    }
}
