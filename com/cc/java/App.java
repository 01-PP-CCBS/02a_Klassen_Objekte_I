package com.cc.java;

public class App {
    
    public static void main(String[] args) {

       // Objekt erzeugen + Werte zuweisen
        Cat cat1 = new Cat("Grizabella", "white", 29);
        output("Blick von außen: " + cat1); 
        output("Blick von innen: " + cat1.getInstanceVar());

        // Werte ausgeben
        output(cat1.getName());
        output(cat1.getFurColor());
        output(Integer.toString(cat1.getAge())); // Typkonvertierung


        output("--------------------");
        
        Cat cat2 = new Cat("Alonzo", "grey", 35);
        output("Blick von außen: " + cat2);
        output("Blick von innen: " + cat2.getInstanceVar());

        // Werte ausgeben
        output(cat2.getName());
        output(cat2.getFurColor());
        output(Integer.toString(cat2.getAge())); // Typkonvertierung

        // cat1.furColor = "gray";
        // output(cat1.furColor)
    } 

    // Statische Methode, die in der Klasse ausgeführt wird ...
    public static void output(String outputStr){
        System.out.println(outputStr);
    }


}

