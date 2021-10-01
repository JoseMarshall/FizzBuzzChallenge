/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.objective;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FizzBuzz myFizzBuzz = new FizzBuzz();

        myFizzBuzz.addFizzRule(3);
        myFizzBuzz.addBuzzRule(5);
//        myFizzBuzz.addCustomRule(15, "Foo");

        var result = myFizzBuzz.generate(1, 100);
        
        result.forEach(System.out::println);
    }
}
