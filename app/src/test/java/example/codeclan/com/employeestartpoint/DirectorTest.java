package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 31/10/2017.
 */

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director(1, "Fred", "AB123456C", 30000.00, "Marketing", 150000.00);
    }

    @Test
    public void canGetBudget() {
        assertEquals(150000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canSetDirectorName() {
        director.setName("Susan");
        assertEquals(true, director.getName());
    }

    @Test
    public void canGetDirectorSalary() {
        director.getSalary();
        assertEquals(30000.00, director.getSalary(), 0.01);
    }
}
