package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {
    Employee employee;
    Manager manager;

    @Before
    public void before() {
        employee = new Employee(1, "Fred", "AB123456C", 30000.00 );
        manager = new Manager(2, "Wilma", "AB123456D", 60000.00, "Marketing");
    }

    @Test
    public void canGetEmployeeId() {
        assertEquals(1, employee.getId());
    }

    @Test
    public void canGetEmployeeName() {
        assertEquals(true, employee.getName());
    }

    @Test
    public void canGetEmployeeSSn() {
        assertEquals("AB123456C", employee.getSocialSecurityNumber());
    }

    @Test
    public void canSetEmployeeName() {
        employee.setName("Betty");
        assertEquals(true, employee.getName());
    }

    @Test
    public void canSetEmployeeNameIfNull() {
        employee.setName(null);
        assertEquals(false, employee.getName());
    }

    @Test
    public void canSetEmployeeNameIfEmptyString() {
        employee.setName("");
        assertEquals(false, employee.getName());
    }

    @Test
    public void canRaiseSalary() {
        employee.raiseSalary(5000.00);
        assertEquals(35000.00, employee.getSalary(), 0.01);
    }

    @Test
    public void getDeptName() {
        assertEquals("Marketing", manager.getDeptName());
    }
}
