package Lesson3;

public class CesarCipher {

    public static void main(String[] args) {

        String message = "Hello, World!";


        String encryptedMessage1 = encryptWithShift(message, 5);
        System.out.println("Encrypted with shift 5: " + encryptedMessage1);


        String encryptedMessage2 = encryptWithDefaultShift(message);
        System.out.println("Encrypted with default shift: " + encryptedMessage2);
    }


    public static String encryptWithShift(String message, int shift) {
        return encryptRecursive(message, shift, 0);
    }


    private static String encryptRecursive(String message, int shift, int index) {

        if (index == message.length()) {
            return "";
        }

        char character = message.charAt(index);


        if (Character.isLetter(character)) {
            char base = Character.isLowerCase(character) ? 'a' : 'A';

            character = (char) (((character - base + shift) % 26 + 26) % 26 + base);
        }


        return character + encryptRecursive(message, shift, index + 1);
    }


    public static String encryptWithDefaultShift(String message) {
        int defaultShift = 3;
        return encryptWithShift(message, defaultShift);
    }

}
