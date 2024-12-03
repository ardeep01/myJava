// Superclass
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}
// Subclass
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog fetches the ball");
    }
}
public class Main {
    public static void main(String[] args) {
        // Upcasting: Treating a Dog as an Animal
        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.sound(); // Calls the overridden method in Dog, output: "Dog barks"
        myAnimal.sleep(); // Calls the method in Animal, output: "Animal is sleeping"

        // Downcasting: Casting back to Dog
        if (myAnimal instanceof Dog) { // Checking to ensure it's safe
            Dog myDog = (Dog) myAnimal; // Downcasting
            myDog.sound(); // Calls the overridden method in Dog, output: "Dog barks"
            myDog.fetch(); // Calls the Dog-specific method, output: "Dog fetches the ball"
        }
    }
}
