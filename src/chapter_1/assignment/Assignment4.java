package chapter_1.assignment;

import java.util.Scanner;

// triangle pattern
public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // number of lines to print
        int count = sc.nextInt();

        // space and space _ _
        String spaceSpace = "  ";
        // star and space x _
        String starSpace = "* ";
        // space and star _ x
        String spaceStar = " *";

        // true : starSpace
        // false : spaceStar
        boolean isUsingStarSpace = true;
        if (count % 2 == 0) {
            isUsingStarSpace = false;
        }

        // number of spaceSpace to draw
        int spaceSpaceCount = count / 2;
        // starcount 1
        int starCount = 1;

        for (int i = 0 ; i < count ; i++) {
            for (int j = 0; j < spaceSpaceCount; j++) {
                System.out.print(spaceSpace);
            }
            for (int k = 0; k < starCount; k++) {
                if (isUsingStarSpace) {
                    System.out.print(starSpace);
                } else {
                    System.out.print(spaceStar);
                }
            }
            System.out.println();
            starCount++;
            if (isUsingStarSpace) {
                spaceSpaceCount--;
            }
            isUsingStarSpace = !isUsingStarSpace;
        }
    }
}
