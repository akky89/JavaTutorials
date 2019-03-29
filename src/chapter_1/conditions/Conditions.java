package chapter_1.conditions;


import java.util.Scanner;

// this is a class
public class Conditions {

    // main method
    public static void main(String[] args) {
//        // Scanner class - Scanner for System input
//        Scanner sc = new Scanner(System.in);
//        // read an integer and store it in var variable.
//        int var = sc.nextInt();
//        int remainder = var % 2;
//        boolean isEvenOld = (remainder == 0); // true or false
//
//        boolean isEven = (var % 2 == 0);
//        System.out.println(isEven);
//
//        if (isEven) {
//            System.out.println("This is an even number");
//        } else {
//            System.out.println("This is an odd number");
//        }

        // 1. only if
        int a = 5;
        if (a ==  6) {
            System.out.println("a is 6");
        }

        // 2. IF..ELSE
        if ( a > 5) {
            System.out.println("a is greater then 5");
        } else {
            System.out.println("a is not greater then 5");
        }

        // 3. if else if
        if (a > 5) {
            System.out.println("a is greater then 5");
        } else if (a == 5) {
            System.out.println("a is  5");
        } else {
            System.out.println("a is less then 5");
        }

        // 4. if else if
        if (a > 5) {
            System.out.println("a is greater then 5");
        } else if (a == 5) {
            System.out.println("a is  5");
        }

        // 5. complex if
        a = 51;
        if ( a < 100) {
            System.out.println("A is less then 100");
            if ( a < 50) {
                System.out.println("A is less thenn 50");
            } else {
                System.out.println("A is not less then 50");
            }
        }
    }
}
