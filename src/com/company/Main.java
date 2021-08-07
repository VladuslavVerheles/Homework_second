package com.company;

public class Main {

    public static void main(String[] args) {
        Person firstOwner = new Person("Vlad", "Verheles", 18);
        Toy ball = new Toy(firstOwner, "red", "Ball");

        Person secondOwner = new Person("Danya", "Black", 17);
        Toy car = new Toy(secondOwner, "black", "Car");

        ball.getInfo();
        car.getInfo();
        ball.changeColour();

        PersonChange PersonChange = new PersonChange();
        PersonChange.ChangeOwner(ball, car);
    }
}
