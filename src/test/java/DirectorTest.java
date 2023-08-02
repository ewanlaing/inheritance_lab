import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Breen", "2BIG2FAIL", 1000000, "Sinister Volcano Dome", 300);
    }

    @Test
    public void hasName(){
        assertEquals("Breen", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("2BIG2FAIL", director.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(1000000, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Sinister Volcano Dome", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5.00);
        assertEquals(1000005.00, director.getSalary(), 0.01);
    }

    @Test
    public void preventsNegativeRaise(){
        director.raiseSalary(-5.00);
        assertEquals(1000000, director.getSalary(), 0.01);
    }

    @Test
    public void canReturnBonus(){
        assertEquals(20000, director.payBonus(), 0.01);
    }

    @Test
    public void hasBudget(){
        assertEquals(300, director.getBudget(), 0.01);
    }

    @Test
    public void canChangeName(){
        director.setName("Barney");
        assertEquals("Barney", director.getName());
    }

    @Test
    public void refusesNullNameChange(){
        director.setName(null);
        assertEquals("Breen", director.getName());
    }
}
