package Lesson3;

public class BarkingDog {


    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // Check if hourOfDay is valid
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        // Check if the dog is barking before 8 AM or after 10 PM
        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, 5));
        System.out.println(shouldWakeUp(true, 10));
        System.out.println(shouldWakeUp(true, 23));
        System.out.println(shouldWakeUp(false, 3));
        System.out.println(shouldWakeUp(true, 24));
    }
}


