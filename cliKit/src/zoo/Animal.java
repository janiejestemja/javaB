package zoo;

public class Animal {
    private String species;

    protected Animal() {
        super();
        this.species = "No species";
    }

    public String getSpecies() {
        return this.species;
    }
    public void setSpecies(String newSpecies) {
        this.species = newSpecies;
    }
}
