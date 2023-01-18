package com.stevengodson;

public class Apple {
    private float mass;
    private float diameter = 1.0f;
    private int x, y;
    static final float EARTH_ACCEL = 9.8f; // static for the class, accessible for each instance
    static String COOKING = "Cooking", EATING = "Eating";
    private String type;
    private String color;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setColor() {
        if (this.type == "Cooking") {
            this.color = "Red";
        } else {
            this.color = "Green";
        }
    }

    public static String[] getAppleSizes() {
        return new String[] {"SMALL", "MEDIUM", "LARGE"};
    }

    public void setType(String type) {
        this.type = type;
        setColor();
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
        String[] appleSizes = getAppleSizes();
        System.out.println("- " + name + " -");
        System.out.println("  Mass: " + mass);
        System.out.println("  Diameter: " + diameter);
        System.out.println("  Position: (" + x + ", " + y + ")");
        if (diameter < 5.0f) {
            System.out.println("  Size: " + appleSizes[0]);
        } else if (diameter < 10.0f) {
            System.out.println("  Size: " + appleSizes[1]);
        } else {
            System.out.println("  Size: " + appleSizes[2]);
        }
        System.out.println("  Type: " + type);
        System.out.println("  Color: " + color);
        getWeight();
        System.out.println("------ END ------");
    }
    public void getWeight() {
        System.out.println("  Weight: " + (mass * EARTH_ACCEL) + "g");;
    }
    public void resetEverything() {
        setY(0);
        setX(0);
        setMass(0.0f);
        setDiameter(0.0f);
    }
}
