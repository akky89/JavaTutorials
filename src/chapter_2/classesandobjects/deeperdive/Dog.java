package chapter_2.classesandobjects.deeperdive;

public class Dog {
    private String name;
    private String eats;
    private int sleeps;
    private double walks;
    // same value between all the objects
    private static String speakWords = "Bark, Bark!!";

    public Dog(String name) {
        this.name = name;
    }

    public static void setSpeakWords(String words) {
        speakWords = words;
    }

    public void eat(String what) {

    }

    public void sleep(int duration) {

    }

    public void walk(double distance) {

    }

    // class level -> same for every object of this class
    public String speak() {
        return speakWords;
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
