package chapter_1.loops;

public class ForLoop {
    // basic for loop
    // for ( < initialization>; <termination - condition>; <increment>) {}
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

        int i = 1;
        for (;i <= 10;){
            System.out.println(i);
            i = i + 2;
        }
    }
}
