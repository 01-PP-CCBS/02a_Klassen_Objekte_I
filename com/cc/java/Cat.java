package com.cc.java;

public class Cat {

    private String name;
    private String furColor;
    private int age;


    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }



    // Adresse der Objektinstanz vom Typ Cat
    public Cat getInstanceVar(){
        return this;
    }


    // Setter
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    // getter
    public String getName() {
        if (checkPermission()) {
            return name;            
        } else {
            return("Sorry, no permission!");
        }
    }

    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }



    
    private boolean checkPermission(){
        return true;
    }



}