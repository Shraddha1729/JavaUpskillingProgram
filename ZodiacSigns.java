
package Lesson4;
import java.time.LocalDate;

public class ZodiacSigns {

    public static String getZodiacSign(LocalDate date) {
        int day = date.getDayOfMonth();
        int month = date.getMonthValue();

        String zodiacSign = switch (month) {
            case 1 -> (day <= 19) ? "Capricorn" : "Aquarius";
            case 2 -> (day <= 18) ? "Aquarius" : "Pisces";
            case 3 -> (day <= 20) ? "Pisces" : "Aries";
            case 4 -> (day <= 19) ? "Aries" : "Taurus";
            case 5 -> (day <= 20) ? "Taurus" : "Gemini";
            case 6 -> (day <= 20) ? "Gemini" : "Cancer";
            case 7 -> (day <= 22) ? "Cancer" : "Leo";
            case 8 -> (day <= 22) ? "Leo" : "Virgo";
            case 9 -> (day <= 22) ? "Virgo" : "Libra";
            case 10 -> (day <= 22) ? "Libra" : "Scorpio";
            case 11 -> (day <= 21) ? "Scorpio" : "Sagittarius";
            case 12 -> (day <= 21) ? "Sagittarius" : "Capricorn";
            default -> "Invalid month";
        };

        return zodiacSign;
    }

    public static String getZodiacSign(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);

        String zodicSign= switch (month) {
            case 1 -> (day <= 19) ? "Capricorn" : "Aquarius";
            case 2 -> (day <= 18) ? "Aquarius" : "Pisces";
            case 3 -> (day <= 20) ? "Pisces" : "Aries";
            case 4 -> (day <= 19) ? "Aries" : "Taurus";
            case 5 -> (day <= 20) ? "Taurus" : "Gemini";
            case 6 -> (day <= 20) ? "Gemini" : "Cancer";
            case 7 -> (day <= 22) ? "Cancer" : "Leo";
            case 8 -> (day <= 22) ? "Leo" : "Virgo";
            case 9 -> (day <= 22) ? "Virgo" : "Libra";
            case 10 -> (day <= 22) ? "Libra" : "Scorpio";
            case 11 -> (day <= 21) ? "Scorpio" : "Sagittarius";
            case 12 -> (day <= 21) ? "Sagittarius" : "Capricorn";
            default -> "Invalid month" ;
        };
        return  zodicSign;
    }

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(1983, 8, 17);
        LocalDate date2 = LocalDate.of(1984, 8, 29);

        System.out.println("Zodiac sign: " + getZodiacSign(date1));
        System.out.println(("Zodiac Signr:" + getZodiacSign(date2)));
    }
}

