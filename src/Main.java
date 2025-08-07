import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
              // Inheritance  = One class inherits the attribute and methods
                        //  from another class.
                        // child <- Parent <- GrandParent
                        // just like a child inherit attributes from the parent

    Dog dog = new Dog();
    Cat cat = new Cat();
    Plant plant = new Plant();

        //inheritance from parent class and grandparent class
        System.out.println(dog.isAlive + "Dog is alive");
        System.out.println(cat.isAlive + "Cat is alive");

        dog.eat();
        dog.eat();

        dog.speak();
        cat.speak();

        System.out.println(plant.isAlive);
        plant.photosynthesis();

    }


}
