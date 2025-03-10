package Lesson3;

public class SecondsAndMintues {

    public static String getDurationString(int seconds){
        int minutes=seconds/60;
        int remainingSeconds=seconds%60;
        return getDurationString(minutes,remainingSeconds);

    }
    public static String getDurationString(int minutes, int seconds){
        int hours= minutes / 60;
        int reamingMinutes= minutes %60;
        return String.format("%02dh %02dm %02ds",hours,reamingMinutes,seconds);

    }


    public static void main(String[] args) {
        String duration=getDurationString(50);
        System.out.println(duration);

        duration=getDurationString(110, 50);
        System.out.println(duration);


    }

}
