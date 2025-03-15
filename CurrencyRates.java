package Lesson4;

public class CurrencyRates {

    public static double currencyConverter( double amount, String currency){

        switch (currency.toUpperCase()){
            case "KR":
                return amount * 11.02;
            case "CH":
                return  amount * 0.95;
            default :
                return 0;
        }
    };

    public static void main(String[] args) {
        double euro= 10.0;
        double swedishKronar= currencyConverter(euro,"KR");
        double swissFranc=currencyConverter(euro,"ch");
        String fomattedSwissFranc=String.format("%.2f",swissFranc);
        String formattedKronar = String.format("%.2f", swedishKronar);
        System.out.println(euro + " Euro = " + formattedKronar + "SEK");
        System.out.println(euro+ " Euro = "+ fomattedSwissFranc + "CHF");
    }
}
