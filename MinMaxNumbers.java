package Lesson6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double min=Double.MAX_VALUE;
        double max=Double.MIN_VALUE;
        boolean validInput=true;
        while(validInput) {

            System.out.println("Enter a number or any character to quit");
            String input=scanner.nextLine();

            try {

                double enteredInput=Double.parseDouble(input);
                if (enteredInput<min)
                {
                    min=enteredInput;
                }
                if (enteredInput>max)
                {
                    max=enteredInput;
                }


            } catch (NumberFormatException e) {
                validInput = false;
                System.out.println("Exiting from loop...");

            }
        }
        if (min != Double.MAX_VALUE && max != Double.MIN_VALUE)
        {
            System.out.println("Min number entered is :" +min);
            System.out.println("Max  number entered is :" +max);

        }
        else
        {
            System.out.println("No valid number were entered");
        }
    }
}
