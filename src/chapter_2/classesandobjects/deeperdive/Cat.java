package chapter_2.classesandobjects.deeperdive;

public class Cat {
    private String name;
    private String eats;
    private int sleeps;
    private double walks;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(String what) {

    }

    public void sleep(int duration) {

    }

    public void walk(double distance) {

    }

    public String speak() {
        return "Meow, Meow!!";
    }

    public String getName() {
        return name;
    }

    public String getEats() {
        return eats;
    }

    public int getSleeps() {
        return sleeps;
    }

    public double getWalks() {
        return walks;
    }
}
