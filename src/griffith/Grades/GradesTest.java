package griffith.Grades;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class GradesTest {

    @Test
    public void testGradesMax() {
        Grades grades = new Grades();
        assertEquals(90, grades.gradesMax(new int[] { 78, 79, 80, 90, 10 }));
        assertEquals(50, grades.gradesMax(new int[] { 10, 20, 50 }));
        assertEquals(-5, grades.gradesMax(new int[] { -10, -20, -5 }));
    }

    @Test
    public void testGradesTotal() {
        Grades grades = new Grades();
        assertEquals(337, grades.gradesTotal(new int[] { 78, 79, 80, 90, 10 }));
        assertEquals(80, grades.gradesTotal(new int[] { 10, 20, 50 }));
        assertEquals(-35, grades.gradesTotal(new int[] { -10, -20, -5 }));
    }

    @Test
    public void testGradesAverage() {
        Grades grades = new Grades();
        assertEquals(67.4, grades.gradesAverage(new int[] { 78, 79, 80, 90, 10 }), 0.01);
        assertEquals(26.67, grades.gradesAverage(new int[] { 10, 20, 50 }), 0.01);
        assertEquals(-11.67, grades.gradesAverage(new int[] { -10, -20, -5 }), 0.01);
    }

    @Test
    public void testGradesCountFails() {
        Grades grades = new Grades();
        assertEquals(1, grades.countFails(new int[] { 78, 79, 80, 90, 10 }, 50));
        assertEquals(2, grades.countFails(new int[] { 10, 20, 50 }, 50));
        assertEquals(3, grades.countFails(new int[] { -10, -20, -5 }, 0));
    }
}
