package Lesson5;

public class FibonacciNumbers {
    public  static void main(String[] args) {
        int num=8;
        if(isGivenNumberFibonacci(num))
        {
            System.out.println(num + " is a Fibonacci Number");
        }
        else
        {
            System.out.println(num + " is not a Fibonacci Number");
        }
    }

    public static boolean isGivenNumberFibonacci(int num)
    {
        return isCalculationCorrect(5 * num * num + 4) || isCalculationCorrect(5 * num * num - 4);
    }
    public static boolean isCalculationCorrect(int x)
    {
        if (x<0)
        {
            return false;
        }
        int i=0;
        while(i*i<x)
        {
            i++;
        }
        return i*i==x;


    }
}
