package chapter_2.classesandobjects.deeperdive;

public class NewAgeMain {

    public int value;

    public NewAgeMain(int value) {
        this.value = value;
    }

    public void increment(int value){
        this.value = this.value + value;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] abc) {
        String broker = abc[0];
        String team = abc[1];
        System.out.println("running for broker : " + broker + " and team : " + team);

//        if (username.equals("username") && password.equals("pass")) {
//            NewAgeMain myMain = new NewAgeMain(5);
//            System.out.println(myMain.getValue());
//            myMain.increment(5);
//            System.out.println(myMain.getValue());
//        } else {
//            System.out.println("Access Denied!!");
//        }

       // try to access value without creating an object
//        value = 5;
    }
}
