class Animal {
    int noOfLegs;
    String species="some animal";
    boolean speaks = false;
    boolean canBark = false;
    boolean mammal = false;

    private void privateMethod(){
        System.out.println("This method is private.");
    }

    private static void privateStaticMethod(){
        System.out.println("This method is private and static.");
    }

    void aboutAnimal() {
        System.out.println(species+" has " + noOfLegs + " legs.");
        System.out.println(species+" can " + (speaks ? "" : "not ") + "speak.");
        System.out.println(species+" is " + (mammal ? "" : "not ") + "a mammal.");
//        privateMethod();
//        privateStaticMethod();
        System.out.println();
    }
}

class Dog extends Animal {
    Dog() {
        species = "Dog";
        noOfLegs = 4;
        canBark = true;
        mammal = true;
        speaks=true;

    }

    void aboutAnimal() {
        System.out.println("This is Dog.");
        super.aboutAnimal();
    }

    void speak() {
        System.out.println("Bark! Bhow!");
    }


}

public class Animals {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.aboutAnimal();

        Dog dog = new Dog();
        dog.aboutAnimal();
        dog.speak();
    }
}
