package Lesson6;


import java.text.NumberFormat;
import java.util.Scanner;

public class InvalidNumbers {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int sum=0;
        for (int count=1; count<=5; count++)
        {
            System.out.println("Enter Number #"+ count);
            String inputNumber=scanner.nextLine();
            try{
                int input=Integer.parseInt(inputNumber);
                System.out.println("Entered number is valid");
                sum=sum+input;

            } catch(NumberFormatException e)
            {
                System.out.println("Enter number is invalid");
                break;

            }

        }

        System.out.println("Total sum is :"+sum);
    }



}
