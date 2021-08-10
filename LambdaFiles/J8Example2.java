package com.ust.java8;

import java.lang.FunctionalInterface;

@FunctionalInterface
interface MyInterface{

 double getPiValue();
}


public class J8Example2 {

    public static void main( String[] args ) {

    // declare a reference to MyInterface
    MyInterface ref;
    
    // lambda expression
    ref = () -> 3.1415;
    
    System.out.println("Value of Pi = " + ref.getPiValue());
    } 
}


