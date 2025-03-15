package Lesson4;

public class DayOfTheWeek {

    public static void printDayOfWeek(int day)
    {
        String dayOfTheWeek=switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println("Day of week is : " + dayOfTheWeek);
    }

    public static void main(String[] args) {
        printDayOfWeek(1);
    }


}
