import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Ewan", "JG123456D", 100000, "Head Office");
    }

    @Test
    public void hasName(){
        assertEquals("Ewan", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JG123456D", manager.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Head Office", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(5.00);
        assertEquals(100005.00, manager.getSalary(), 0.01);
    }

    @Test
    public void preventsNegativeRaise(){
        manager.raiseSalary(-5.00);
        assertEquals(100000, manager.getSalary(), 0.01);
    }

    @Test
    public void canReturnBonus(){
        assertEquals(1000, manager.payBonus(), 0.01);
    }

    @Test
    public void canChangeName(){
        manager.setName("Barney");
        assertEquals("Barney", manager.getName());
    }

    @Test
    public void refusesNullNameChange(){
        manager.setName(null);
        assertEquals("Ewan", manager.getName());
    }


}
