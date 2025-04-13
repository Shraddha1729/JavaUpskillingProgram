package Lesson8;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real =this.real+ real;
        this.imaginary=this.imaginary+imaginary;
    }

    public void subtract(double real, double imaginary) {
        this.real =this.real-real;
        this.imaginary =this.imaginary-imaginary;
    }

    public static ComplexNumber addNumbers(ComplexNumber num1, ComplexNumber num2) {
        double resultReal = num1.getReal() + num2.getReal();
        double resultImaginary = num1.getImaginary() + num2.getImaginary();
        return new ComplexNumber(resultReal, resultImaginary);
    }
    public static ComplexNumber subtractNumbers(ComplexNumber num1, ComplexNumber num2) {
        double resultReal = num1.getReal() - num2.getReal();
        double resultImaginary = num1.getImaginary() - num2.getImaginary();
        return new ComplexNumber(resultReal, resultImaginary);
    }
    public String toString() {
        return real + " + " + imaginary + "i";
    }


}
