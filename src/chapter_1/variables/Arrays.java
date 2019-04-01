package chapter_1.variables;

public class Arrays {
    public static void main(String[] args) {
        // cannot change size
        //                  0  1  2  3  4
//        int[] firstArray = {1, 22, 3, 14, 5};
//        firstArray[1] = 300;
//
//        for(int i=0; i<firstArray.length; i++) {
//            System.out.println(i + " : " + firstArray[i]);
//        }

//        int[] secondArray = new int[100];
//
//        for(int value : secondArray){
//            System.out.println(value);
//        }
//
//        float[] floatArray = new float[100];
//        String[] strArray =  new String[5];
//
//        for (int i=0; i<strArray.length; i++) {
//            strArray[i] = "abc";
//        }
//
//        for(String str : strArray) {
//            System.out.println(str);
//        }
//
//        // 2D array
//        int[][] first2dArray = new int[5][5];
//        int location = 0;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j<5; j++) {
//                first2dArray[i][j] = location++;
//            }
//        }
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j<5; j++) {
//                System.out.print(first2dArray[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        int[][][] first3dArray = new int[5][5][5];

//        int[][] directInit2dArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(directInit2dArray[i][j] + " ");
//            }
//            System.out.println();
//        }

        int[][][] directInit3dArray = {{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}}, {{2, 2, 2}, {3, 3, 3}, {4, 4, 4}}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(directInit3dArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
