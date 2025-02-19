package griffith;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class GradeTest {

    @Test
    void testGradesMax() {
        Grades grades = new Grades();
        assertEquals(100, grades.gradesMax(new int[] {
                78, 79, 80, 90, 10
        }));
    }

    void testGradesTotal() {
        Grades grades = new Grades();
        assertEquals(100, grades.gradesTotal(new int[] {
                78, 79, 80, 90, 10
        }));
    }

    @SuppressWarnings("deprecation")
    void testGradesAverage() {
        Grades grades = new Grades();
        assertEquals(100.0, grades.gradesAverage(new int[] {
                78, 79, 80, 90, 10
        }));
    }

    void testGradesCountFails() {
        Grades grades = new Grades();
        assertEquals(100, grades.gradesMax(new int[] {
                78, 79, 80, 90, 10
        }));
    }

}
