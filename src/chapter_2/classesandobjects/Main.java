package chapter_2.classesandobjects;


public class Main {
    public static void main(String[] args) {
        FirstClass obj = new FirstClass(10, 9.0f, "blah blah");
        FirstClass obj1 = new FirstClass(4.5f);
        FirstClass obj2 = new FirstClass(30);
        FirstClass obj3 = new FirstClass(30, 5.0f);

        System.out.println("1:\n" + obj.intVar);
        System.out.println(obj.strVar);
        System.out.println(obj1.intVar);
        System.out.println(obj1.strVar);

        obj.intVar = 50;
        obj1.strVar = "don't know";

        System.out.println("2:\n" + obj.intVar);
        System.out.println(obj.strVar);
        System.out.println(obj1.intVar);
        System.out.println(obj1.strVar);
    }
}

class FirstClass {
    int intVar;
    float floatVar;
    String strVar;

    // constructor overloading
    FirstClass() {
        this(10, 9.0f, "blah blah blah");
    }

    FirstClass(int val1) {
        this(val1, 9.0f, "blah blah blah");
    }

    FirstClass(float val1) {
        this(10, val1, "blah blah blah");
    }

    FirstClass(int val1, float val2) {
        this(val1, val2, "blah blah blah");
    }

    FirstClass(int val1, float val2, String val3) {
        intVar = val1;
        floatVar = val2;
        strVar = val3;
    }
}