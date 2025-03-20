package Lesson5;

public class PalindromeNumber {

    public static boolean isPalindrome(int inputNumber) {
        if (inputNumber < 0) {
            return false;
        }
        int originalNumber = inputNumber;
        int reversedNumber = 0;
        while (inputNumber > 0) {
            int digit = inputNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            inputNumber = inputNumber /10;
        }
        return originalNumber == reversedNumber;
        }
        public static void main(String[] args) {
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(701));
            }
        }


