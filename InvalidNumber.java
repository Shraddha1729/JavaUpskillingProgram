package Lesson6;

import java.util.Scanner;

public class InvalidNumber {

    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
       int sum=0;
       int count=1;
       while(count<=5)
       {
           System.out.println("Enter number #"+ count);

           try{
               String inputNumber= scanner.nextLine();
               int input=Integer.parseInt(inputNumber);
               sum=sum+input;

           }

           catch(NumberFormatException e)
           {
               System.out.println("Entered number is invalid");
               break;
           }

           count++;
       }
        System.out.println("Total Sum is : "+sum);
    }

}
