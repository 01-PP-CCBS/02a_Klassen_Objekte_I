package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Cat --> Referenztyp (Klasse aus dem das Objekt ensteht)
        // cat1 --> Refenzvariable (Adresse des Objekts im RAM)
        Cat cat1 = new Cat(); // Instanziierung >> Objekt
        output("Blick von aussen: " + cat1); // Adresse des Objekts
        cat1.sayHi();
        output("--------------------");
        Cat cat2 = new Cat();
        output("Blick von aussen: " + cat2);
        cat2.sayHi();

       output("hi");

    } 

    // Statische Methode, die in der Klasse ausgeführt wird ...
    public static void output(String outputStr){
        System.out.println(outputStr);
    }



}

