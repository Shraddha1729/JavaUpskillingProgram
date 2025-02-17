package Lesson1;

public class firstLessonAssignmentLeapYear {
    public static void main(String[] args) {

        int leapYear=2000;
        if ( (leapYear % 4 == 0 && leapYear % 100 !=0) || (leapYear % 400 ==0))
        {
            System.out.println("Given year is a leap year");
        }
        else
            System.out.println("Given year is not a leap year");

    }
}
