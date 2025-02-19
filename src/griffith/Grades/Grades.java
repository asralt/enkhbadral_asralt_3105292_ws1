package griffith.Grades;

public class Grades {
    // loops throught grade array and gets the max and returns
    public int gradesMax(int[] grades) {
        int max = 0;
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    };

    // method loops thorught the array and addes all of the grades and returns the
    // total
    public int gradesTotal(int[] grades) {
        int total = 0;
        for (int grade : grades) {
            total = +grade;
        }
        return total;
    };

    // calls the grades total method and devides it by grades length and returns it(
    // which is average)
    public double gradesAverage(int[] grades) {
        if (grades.length == 0) {
            return 0;
        } else {
            return (double) gradesTotal(grades) / grades.length;
        }

    };

    // method loops through and if the grade is lower than the minGrade and
    // increasese the count and returns the count
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