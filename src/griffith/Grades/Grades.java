package griffith.Grades;

public class Grades {
    public int gradesMax(int[] grades) {
        int max = 0;
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    };

    public int gradesTotal(int[] grades) {
        int total = 0;
        for (int grade : grades) {
            total = +grade;
        }
        return total;
    };

    public double gradesAverage(int[] grades) {
        if (grades.length == 0) {
            return 0;
        } else {
            return (double) gradesTotal(grades) / grades.length;
        }

    };

    public int countFails(int[] grades, int minGrade) {
        int count = 0;
        for (int grade : grades) {
            if (grade < minGrade) {
                count++;
            }
        }
        return count;
    };
}