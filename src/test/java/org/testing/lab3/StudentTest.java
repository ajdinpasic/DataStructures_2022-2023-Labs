package org.testing.lab3;

import org.junit.jupiter.api.*;
import org.lab3.Student;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentTest {

    private Student student;

    @BeforeEach
    public void setUp() {
        this.student = new Student("Ajdin","IT",9.10);
    }
    @AfterEach
    public void tearDown() {
        this.student = null;
    }

    @Test
    @Order(1)

    public void testsIsFirstObjectGreaterThanSecond() {
        assertEquals(1,this.student.compareTo(new Student("John","IT",7.77)));
    }

    @Test
    @Order(2)
    public void testsIsFirstObjectLessThanSecond() {
        assertEquals(-1,this.student.compareTo(new Student("John","IT",17.77)));
    }

    @Test
    @Order(3)
    public void testsAreTwoObjectsEqual() {
        assertEquals(0,this.student.compareTo(new Student("John","IT",9.10)));
    }

    @Test
    @Order(4)
    public void testsAreTwoObjectsNotEqual() {
        assertNotEquals(0,this.student.compareTo(new Student("John","IT",7.77)));
    }

}
