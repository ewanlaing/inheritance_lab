import techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("The G Man", "MYST3RY M4N", 100);
    }

    @Test
    public void hasName(){
        assertEquals("The G Man", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("MYST3RY M4N", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(100, databaseAdmin.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(5.00);
        assertEquals(105.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void preventsNegativeRaise(){
        databaseAdmin.raiseSalary(-5.00);
        assertEquals(100, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canReturnBonus(){
        assertEquals(1, databaseAdmin.payBonus(), 0.01);
    }

    @Test
    public void canChangeName(){
        databaseAdmin.setName("Barney");
        assertEquals("Barney", databaseAdmin.getName());
    }

    @Test
    public void refusesNullNameChange(){
        databaseAdmin.setName(null);
        assertEquals("The G Man", databaseAdmin.getName());
    }
}
