import techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Gordon Freeman", "US654321Q", 10000);
    }

    @Test
    public void hasName(){
        assertEquals("Gordon Freeman", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("US654321Q", developer.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(10000, developer.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(5.00);
        assertEquals(10005.00, developer.getSalary(), 0.01);
    }

    @Test
    public void preventsNegativeRaise(){
        developer.raiseSalary(-5.00);
        assertEquals(10000, developer.getSalary(), 0.01);
    }

    @Test
    public void canReturnBonus(){
        assertEquals(100, developer.payBonus(), 0.01);
    }

    @Test
    public void canChangeName(){
        developer.setName("Barney");
        assertEquals("Barney", developer.getName());
    }

    @Test
    public void refusesNullNameChange(){
        developer.setName(null);
        assertEquals("Gordon Freeman", developer.getName());
    }
}
