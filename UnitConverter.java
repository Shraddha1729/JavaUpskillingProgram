package Lesson3;

public class UnitConverter {

    public static double convertToCentimeters(int inches)
    {
       double heightInCm=inches * 2.54;
       return heightInCm;

    }
   public static double convertToCentimeters (int feet, int inches)
   {
       int totalInches= (feet *12) + inches;
       return convertToCentimeters(totalInches);

  }

    public static void main(String[] args) {

        double fromInchesToCentrimeres=convertToCentimeters(5);
        System.out.printf("Height in Centrimeters: %.1f cm %n", fromInchesToCentrimeres);
        double fromFeetAndInchesToCentrimeters=convertToCentimeters(5,8);
        System.out.printf("Height in Centimeters: %.1f cm %n",fromFeetAndInchesToCentrimeters);
    }
}
