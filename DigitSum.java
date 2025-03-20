
package Lesson5;

public class DigitSum {


    public static int sumDigits(int x) {
        if (x < 0) {
            return -1;
        }

        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x= x/10;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(sumDigits(125));

    }
}

