package com.game;

public class Field {
    public Apple a1 = new Apple();
    public Apple a2 = new Apple();
    public void setupApples(String[] args) {
        a1.setName(args[0]);
        a1.setDiameter(3.0f);
        a1.setMass(5.0f);
        a1.setX(20);
        a1.setY(40);
        a1.setType( Apple.COOKING );
        a2.setName(args[1]);
        a2.setDiameter(8.0f);
        a2.setMass(10.0f);
        a2.setX(20);
        a2.setY(22);
        a2.setType( Apple.EATING );
    }
    public void detectCollision() {
        if (a1.isTouching(a2)) {
            System.out.println("Collision detected!");
        } else {
            System.out.println("Apples are not touching.");
        }
    }
}
