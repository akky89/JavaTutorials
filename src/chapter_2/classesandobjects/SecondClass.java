package chapter_2.classesandobjects;

// encapsulation - wrapping up of data.
public class SecondClass {
    public int pubVal; // can be accessed by anyone
    private int privVal; // can only be accessed by this class
    protected int protVal; // can be accessed by either my children and my package

    int defaultVal; // can be accessed by my package only

    public SecondClass(){
        pubVal = 10;
        privVal = 100;
        protVal = 200;
        defaultVal = 300;
    }
}
