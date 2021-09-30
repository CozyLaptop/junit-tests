import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testCreateStudent(){
        Student albert = new Student(628017, "albert");
        Student bob = null;
        assertNotNull(albert);
        assertNull(bob);
    }
    @Test
    public void testStudentFields(){
        Student albert = new Student(628017, "albert");
        assertSame(628017, albert.getId());
        assertSame("albert", albert.getName());
        assertSame(0, albert.getGrades().size());
    }
    @Test
    public void testAddGrade(){
        Student albert = new Student(628017, "albert");
        albert.addGrade(80);
        assertSame(80, albert.getGrades().get(0));
        albert.addGrade(120);
        assertSame(80, albert.getGrades().get(1));
    }
    @Test
    public void testAverageGrade(){
        Student albert = new Student(628017, "albert");
        albert.addGrade(100);
        albert.addGrade(80);
        assertEquals(90, albert.getGradeAverage(), 0);
    }
}