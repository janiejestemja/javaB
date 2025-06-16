import java.util.Scanner;
import java.util.ArrayList;

import zoo.Zoo;
import zoo.Pet;

public class Main {
    public static void main(String[] args) {
        System.out.print("Name your Zoo: ");
        String input = getInput();

        Zoo circus = new Zoo(input);
        circus.printReport();



        // Setup circus
        for (int c = 0; c <= 5; c++) {

            // Setup cat pet
            Pet cat = new Pet();
            cat.setSpecies("Mammal");
            cat.setName("Cat" + c);

            cat.setAge((float) 3.14 + (float) 0.1 * c);
            cat.setWeight((float) 9.81 - (float) 0.2 * c);

            circus.addPet(cat);
        }
        ArrayList<Pet> animals = circus.getPets();

        // Print out info
        System.out.print("There are: ");
        System.out.print(animals.size());
        System.out.println(" Animals in the Zoo:");

        for (Pet pet: animals) {
            pet.printInfo();
            System.out.println("");
        }
    }

    private static String getInput() {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        
        sc.close();
        return input;
    }
}
