package io.zipcoder.polymorphism;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    public static void main(String[] args) {
        Boolean on = true;
        while (on) {
            Integer response = Console.getNumberOfPets("How many pets do you have? : ");
            ArrayList<Pet> petList = new ArrayList<Pet>();

            if(response > 0) {
                for (int j = 0; j < response; j++) {
                   String petType = Console.getType("What type of pets do you have? : ");
                    String nameValue = Console.getNameOfPets("What is your pet's name? : ");
            switch (petType) {
                case ("Cat"):
                    Cat cat = new Cat(nameValue);
                    petList.add(cat);
                    break;
                case ("Dog"):
                    Dog dog = new Dog(nameValue);
                    petList.add(dog);
                    break;
                case ("Bird"):
                    Bird bird = new Bird(nameValue);
                    petList.add(bird);
                    break;
                default:
                    System.out.println("Can you please repeat that!");
                    break;
            }

        }
                System.out.println("\n Your pets: \n");
                for (int i = 0; i < petList.size(); i++) {
                    System.out.println(petList.get(i).getClass().getSimpleName() + " " + petList.get(i).getName() + " says: " + petList.get(i).speak());
                }
                System.out.println("Goodbye!");
                on = false;
            }
        }
    }
}
