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

        myFizzBuzz.addRule(5, "Buzz");
        myFizzBuzz.addRule(3, "Fizz");

        var result = myFizzBuzz.generate(1, 100);
        
        result.forEach(System.out::println);
    }
}
