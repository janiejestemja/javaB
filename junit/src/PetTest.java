import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PetTest {

    String name = "Catalyna";
    Pet cat = new Pet(name);

    @Test
    public void testName(){
        System.out.println("Running Test 1!");
        Assertions.assertEquals(name, "Catalyna", "Not the name."); 
    }
 
    @Test
    public void testGetName(){
        System.out.println("Running Test 2!");
        Assertions.assertEquals(name, cat.getName() , "Not the name."); 
    }
}
