package chapter_1.variables;

public class Variables {
    public static void main(String[] args) {
//        // <data type> <identifier>
//        // int -> integer (primitive types)
//        // variables' name is identifier
//        int firstInt = 5; // directly saved in method - no memory allocation (new)
//        int secondInt = 5;
//        // int is 32 bit -> sing bit - 31bits (values)  -2^31 + 1 <-> 2^31 - 1
//        int sum = firstInt + secondInt;
//        System.out.println(sum);
//
//        // float -> floating point number
//        float firstFloat = 5.4f;
//        float secondFloat = 6.4f;
//        System.out.println(firstFloat + secondFloat);
//
//        // double -> floating point number but with double precision
//        double firstD = 0d;
//        double secondD = 6.6;
//
//        // short - 16 bit
//        short firstShort = 1500;
//        short secondShort = 1000;
//
//        // byte - 8 bits
//        byte firstByte = 8;
//        byte secondByte = 10;
//
//        // boolean - true/false
//        boolean firstBoolean = true;
//        boolean falseBoolean = false;
//        System.out.println(firstBoolean | falseBoolean);
//
//
//        // first non-primitive - String
//        String randomStr = new String("abc");
//        String firstString = "abc";
//        String secondStr = "efg";
//        System.out.println(firstString + secondStr);

        // String pool
        String abc = "abc";
        String cba = "abc";
        String bca = new String("abc");
        String plus = "+";
        abc = abc + "d";

        System.out.println(plus == "+");
        System.out.println(abc == cba);
        System.out.println(abc == "abc");
        System.out.println(abc.equals(cba));
        System.out.println(bca == abc);
        System.out.println(bca.equals(abc));
    }
}
