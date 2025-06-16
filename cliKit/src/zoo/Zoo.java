package zoo;
import zoo.Pet;

import java.util.ArrayList;

public class Zoo {
    private String name;
    private ArrayList<Pet> pets = new ArrayList<>();

    public Zoo(String newName) {
        super();
        this.name = newName;
    }

    // Getter and Setter
    public void setName(String newName) {
        this.name = newName;
    }
    public String getName() {
        return this.name;
    }

    public void addPet(Pet newPet) {
        this.pets.add(newPet);
    }
    public void sellPet() {
        this.pets.remove(0);
    }
    public ArrayList<Pet> getPets() {
        return this.pets;
    }

    // Print report to terminal
    public void printReport() {
        System.out.println("Zoo information");
        System.out.print("Name: ");
        System.out.println(this.getName());
    }
}
