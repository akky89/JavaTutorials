package chapter_2.classesandobjects;

public class Driver {
    public static void main(String[] args) {
//        SecondClass obj = new SecondClass();
//        System.out.println(obj.pubVal);
//        obj.pubVal = 100;
//        System.out.println(obj.pubVal);
////        System.out.println(obj.privVal);
//        System.out.println(obj.protVal);

        ThirdClass tObj = new ThirdClass();
        int value = tObj.getVal1();
        System.out.println(value);
    }
}
