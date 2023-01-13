package com.game;

public class Apple {
    private float mass;
    private float diameter = 1.0f;
    private int x, y;
    static final float EARTH_ACCEL = 9.8f; // static for the class, accessible for each instance
    static int SMALL = 0, MEDIUM = 1, LARGE = 2;
    static String COOKING = "Cooking", EATING = "Eating";
    private String type;
    private int size;
    private String color;

    private void setColor() {
        if (this.type == "Cooking") {
            this.color = "Red";
        } else {
            this.color = "Green";
        }
    }
    public void setType(String type) {
        this.type = type;
        setColor();
    }

    public void setSize(int size) {
        this.size = size;
    }

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    boolean isTouching (Apple other) {
        double xdiff = x - other.x;
        double ydiff = y - other.y;
        double distance = Math.sqrt(xdiff * xdiff + ydiff * ydiff);
        if (distance < diameter / 2 + other.diameter / 2) {
            return true;
        } else {
            return false;
        }
    }

    public void printDetails() {
        System.out.println("  mass: " + mass);
        System.out.println("  diameter: " + diameter);
        System.out.println("  position: (" + x + ", " + y + ")");
        System.out.println("  size: " + size);
        System.out.println("  type: " + type);
        System.out.println("  color: " + color);
    }
    public void getWeight() {
        System.out.println("Weight " + (mass * EARTH_ACCEL) + "g");;
    }
    public void resetEverything() {
        setSize( MEDIUM );
        setY(0);
        setX(0);
        setMass(0.0f);
        setDiameter(0.0f);
    }
}
