package Lesson4;

public class CountryName {

    public static void getCountryCode(String  phoneNumber){
        String countryCode= phoneNumber.substring(1,3);
        String countryName=switch(countryCode)
        {
            case "46" -> "Sweden";
            case "43" -> "Austria";
            case "45" -> "Denmark";
            case "33" -> "France";
            case "34" -> "Spain";
            case "31" -> "Netherlands";
            case "39" -> "Italy";
            case "49" -> "Germany";
            case "32"-> "Belgium ";
            case "40"->"Romania";
            default -> "Unknown Country";
        };
        System.out.println(countryName);
    }

    public static void getCountryCode(long  phoneNumber){

       String phoneNumberStr= String.valueOf(phoneNumber);
       String getCountryCode= phoneNumberStr.substring(1,3);
        String countryName=switch(getCountryCode)
        {
            case "46" -> "Sweden";
            case "43" -> "Austria";
            case "45" -> "Denmark";
            case "33" -> "France";
            case "34" -> "Spain";
            case "31" -> "Netherlands";
            case "39" -> "Italy";
            case "49" -> "Germany";
            case "32"-> "Belgium ";
            case "40"->"Romania";
            default -> "Unknown Country";
        };
        System.out.println(countryName);
    }


    public static void main(String[] args) {
        getCountryCode("+45 12345678");
        getCountryCode("+46 21345678");
    }
}
