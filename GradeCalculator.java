package Lesson3;

public class GradeCalculator {

    public static String gradeCalculation(int score)
    {
        if (score >=70 && score<=100)
        {
            return "A";
        } else if (score >=60 && score<70) {
            return "B";
        } else if (score >=50 && score<60) {
            return "C";
        } else if (score >=40 && score<50) {
            return "D";
        }
        else
        {
            return "E";
        }
    }

    public static void main(String[] args) {
        int examScore=75;
        String grade= gradeCalculation(examScore);
        System.out.println("The grade for examscore " + examScore+ " = " + grade);
    }
}
