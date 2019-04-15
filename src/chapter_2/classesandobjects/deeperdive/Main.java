package chapter_2.classesandobjects.deeperdive;

public class Main {

    public static void main(String[] args) {
        Dog petDog = new Dog("Jackie");
        Dog newPetDog = new Dog("Rocky");
        Cat petCat = new Cat("Bubbles");

        petDog.eat("Chicken");
        petDog.sleep(5);
        petDog.walk(1.0);

        petCat.eat("Chicken");
        petCat.sleep(5);
        petCat.walk(1.0);

        Dog.setSpeakWords("Bark, Bark!!");
        System.out.println(newPetDog.getName() + " : " + newPetDog.speak());
        System.out.println(petDog.getName() + " : " + petDog.speak());
        System.out.println(petCat.getName() + " : " + petCat.speak());

        Dog.setSpeakWords("kraB, kraB!!");
        System.out.println(newPetDog.getName() + " : " + newPetDog.speak());
        System.out.println(petDog.getName() + " : " + petDog.speak());
        System.out.println(petCat.getName() + " : " + petCat.speak());
    }
}
