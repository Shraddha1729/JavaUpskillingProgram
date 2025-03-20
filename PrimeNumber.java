package Lesson5;

public class PrimeNumber {


    public static void main(String[] args) {

        int firstNo = 1;
        int LastNo=10;

        int primeNumbersCount = countOfPrimeNumber(firstNo, LastNo);
        System.out.println("Number of prime numbers in between " + firstNo + " and " + LastNo + " is: " + primeNumbersCount);
    }

    public static int countOfPrimeNumber(int firstNumber, int lastNumber) {
        int primeNoCount = 0;

        for (int i = firstNumber; i <= lastNumber; i++) {
            if (isGivenNumberPrime(i)) {
                primeNoCount++;
            }
        }

        return primeNoCount;
    }
    public static boolean isGivenNumberPrime(int num) {
        if (num ==0 || num == 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {  // Iterate until half of the number
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    }
