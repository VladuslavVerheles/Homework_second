package com.company;

public class PersonChange {
    void ChangeOwner(Toy ball, Toy car){
        Person temp = ball.owner;

        ball.owner = car.owner;
        car.owner = temp;

        System.out.println("\nExchange complete\n");
        ball.getInfo();
        car.getInfo();
    }
}
