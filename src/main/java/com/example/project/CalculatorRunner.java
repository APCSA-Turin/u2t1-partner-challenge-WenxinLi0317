
package com.example.project;


public class CalculatorRunner {
   public static void main(String[] args) {


       //test your program here
       //1. create an instance of the calculator class
       Calculator calculator = new Calculator("TI84");
      
       calculator.performOperation("+",10,-5);
      
       calculator.divisibleBy(2, 3);


       calculator.divisibleBy(4, 2);


       calculator.coordinatePair(2, 3);


       calculator.absoluteValue(2, 3);


       calculator.info();
      
       calculator.performOperation("-", 5, 1);
      
       calculator.performOperation("*", 2, -8);


       calculator.performOperation("/", 4, 2);


       calculator.performOperation("?", 4, 2);












       //2. call any methods of that class to test


   }
}
