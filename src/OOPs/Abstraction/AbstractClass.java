package OOPs.Abstraction;

abstract  class Animal {
    abstract void walk();

    Animal(){
        System.out.println("You are creating a new animal");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{

    Horse(){
        System.out.println("Created a Horse");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
       Horse h1 = new Horse();

//       Animal a1 = new Animal();
//       a1.walk();
//        run time error

    }
}