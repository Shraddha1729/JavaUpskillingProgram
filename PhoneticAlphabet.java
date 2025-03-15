package Lesson4;

public class PhoneticAlphabet {

    public static void getLetter(char letter) {

        switch (letter) {
            case 'A':
                System.out.println("Charlie");
                break;
            case 'B':
                System.out.println("Alfa");
                break;
            case 'C':
                System.out.println("Romeo");
                break;
            default:
                System.out.println("Invalid input");

        }

    }

    public static void main(String[] args) {
        getLetter('A');
    }
};




