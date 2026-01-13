public class Cgpa {
    public static void main(String[] args) {

        int gradePoint1 = 8;
        int gradePoint2 = 9;
        int gradePoint3 = 7;

        int credit1 = 3;
        int credit2 = 4;
        int credit3 = 2;

        int sumGradePoints = (gradePoint1 * credit1) +
                             (gradePoint2 * credit2) +
                             (gradePoint3 * credit3);

        int sumCredits = credit1 + credit2 + credit3;

        double cgpa = (double) sumGradePoints / sumCredits;

        System.out.println("The CGPA of the student is: " + cgpa);
    }
}
