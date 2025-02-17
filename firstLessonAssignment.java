package Lesson1;

public class firstLessonAssignment {


    public static void main(String[] args){

        double x=20.00;
        double y=80.00;
        double z=x+y;
        double remainder = z%40;

        System.out.println("Value of 'x' is: "+ x);
        System.out.println("Value of 'y' is: "+y);
        //Addition of numbers 'x' and 'y'
        System.out.println("Value of addition of 'x' and 'y' is: "+z);
        //Multiplying by 100 to result of sum of 'x' and 'y' i.e. z*100
        System.out.println("Value of z after multiplying by 100,  "+ z*100);
        //Printing of remainder from above output i.e. z*100
        System.out.println("Remainder is : "+ remainder );

        boolean isZero= (remainder==0.00)?true: false;
        System.out.println(isZero);

        if(isZero==false)
        {
            System.out.println("We got some remainder");
        }

        }





}
