package Lesson8;

public class Main {
    public static void main(String[] args) {

        Carpet carpet1=new Carpet(8, 10);

        System.out.println("Total cost for Carpet1 is " + String.format("%.2f", carpet1.getTotalCost()) + " €");

        Carpet carpet2= new Carpet(5 , 6);
        System.out.println("Total cost for Carpet2 is "+ String.format("%.2f" , carpet2.getTotalCost()) + " €");


        ComplexNumber num1 = new ComplexNumber(5, 3);
        ComplexNumber num3 = new ComplexNumber(3, 1);
        ComplexNumber num4 = new ComplexNumber(-1, 2);

        num1.add(2, 4);
        System.out.println("After addition, num1 = " + num1);
        num1.subtract(1, 3);
        System.out.println("After subtraction, num1 = " + num1);

        ComplexNumber resultAdd = ComplexNumber.addNumbers(num3, num4);
        ComplexNumber resultSubtract = ComplexNumber.subtractNumbers(num3, num4);

        System.out.println("The sum of num1 and num2 is: " + resultAdd);
        System.out.println("The difference between num1 and num2 is: " + resultSubtract);


    }





}
