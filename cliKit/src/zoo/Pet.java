package zoo;
import zoo.Animal;

public class Pet extends Animal {
    // Attributes
    private String name;

    private float age;
    private float weight;

    private boolean isFed;

    // Constructor
    public Pet() {
        super();
        this.name = (String) "Not named";
        this.age = (float) 0.0;
        this.weight = (float) 0.0;
        this.isFed = (boolean) false;
    }

    // Getter and Setter
    public String getName() {
        return this.name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public float getAge() {
        return this.age;
    }
    public void setAge(float newAge) {
        this.age = newAge;
    }
    public float getWeight() {
        return this.weight;
    }
    public void setWeight(float newWeight) {
        this.weight = newWeight;
    }
    public boolean getIsFed() {
        return this.isFed;
    }
    protected void setIsFed(boolean newIsFed) {
        this.isFed = newIsFed;
    }

    public void printInfo() {
        System.out.println("Pet Information");

        System.out.print("  Name: ");
        System.out.println(this.getName());

        System.out.print("  Species: ");
        System.out.println(this.getSpecies());

        System.out.print("  Age: ");
        System.out.println(this.getAge());

        System.out.print("  Weight: ");
        System.out.println(this.getWeight());
        
        System.out.print("  Is fed: ");
        System.out.println(this.getIsFed());
    }
}
