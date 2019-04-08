package chapter_2.classesandobjects;

public class ThirdClass {
    // Data hiding
    private int val1;
    private int val2;

    public ThirdClass() {
        val1 = 100;
        val2 = 200;
    }

    // <access_modifier:public> <return type: int> methodName(<parameters>)
    public int getVal1(/*<empty>*/String password) {
        // val1 = 9, 9 10th index
        if(password == "secure") {
            return val1 + 1;
        } else {
            return -1;
        }
    }

    //<public> <return type: void> <parameters : val1>
    public void setVal1(int val1, String password) {
        // class's val1 = val1
        if(password == "secure") {
            if (val1 <= 0) {
                System.out.println("ERROR ERROR ERROR!!!");
            } else {
                this.val1 = val1;
            }
        } else {
            System.out.println("Unauthorized access!!");
        }
    }

    public int getVal2() {
        return val2;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }
}
