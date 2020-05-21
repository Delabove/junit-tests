import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student fer;
    Student douglas;

    @Before
    public void init(){
        fer = new Student(1L, "Fer");
        douglas = new Student(2L, "Douglas");

    }

    @Test
    public void testIfIdWorks(){
        assertEquals(1L, fer.getId());
        assertEquals(2L, douglas.getId());
    }

    @Test
    public void testIfNameWorks(){
        assertEquals("Fer", fer.getName());
        assertEquals("Douglas", douglas.getName());
        assertNotEquals("Fer", douglas.getName());
    }

    @Test
    public void testIfGradesWorks(){
        assertEquals(0, fer.getGrades().size());
    }

    @Test
    public void testIfAddGradeWorks(){
        fer.addGrade(80);
        assertTrue(80 == fer.getGrades().get(0));
        fer.addGrade(100);
        assertEquals(100, fer.getGrades().get(1), 0);
    }

    @Test
    public void testIfAvgWorks(){
        assertEquals(0, fer.getAverage(), 0);
        fer.addGrade(100);
        fer.addGrade(50);
        fer.addGrade(100);
        // 250 / 3 = 83.33
        assertEquals(83.33, fer.getAverage(), 0.1);
        fer.addGrade(50);
        //75
        assertEquals(75, fer.getAverage(), 0);
    }

}