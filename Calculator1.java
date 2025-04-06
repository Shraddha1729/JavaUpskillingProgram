package Lesson6;
import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
            calculateSumAndAverage();
        }

        public static void calculateSumAndAverage() {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            int count = 0;

            while (true) {
                System.out.print("Enter a number: ");
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    sum += number;
                    count++;
                } else {
                    break;
                }
            }

            if (count > 0) {

                double average = (double) sum / count;
                System.out.println("SUM = " + sum + " AVG = " + average);
            } else {
                System.out.println("No valid numbers were entered.");
            }

            scanner.close();
        }
    }


