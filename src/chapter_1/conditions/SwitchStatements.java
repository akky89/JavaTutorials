package chapter_1.conditions;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option = sc.next();

        switch(option) {
            case "apoorv": {
                System.out.println("option 1 selected");
                break;
            }
            case "billi": {
                System.out.println("option 2 selected");
                break;
            }
            case "priyanka": {
                System.out.println("option 3 selected");
                break; // forgetting adding break is the most common mistake
            }
            case "chudail": {
                System.out.println("option 4 selected");
                break;
            }
            default : {
                System.out.println("wrong input");
            }
        }
    }
}
