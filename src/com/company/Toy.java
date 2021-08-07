package com.company;

public class Toy {
    Person owner;
    String color;
    String name;

    public Toy(Person owner, String color, String name) {
        this.owner = owner;
        this.color = color;
        this.name = name;
    }

    public void getInfo(){
        System.out.println("Owner:" + owner.firstName + " " + owner.lastName + " " + owner.age + " " + "Color:" + color + " " + "Name:" + name);
    }

    public void changeColour() {
        color = "green";
    }
}
