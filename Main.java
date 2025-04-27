package Lesson10;



public class Main {
    public static void main(String[] args) {
        SpaceInvestigator Investigator = new SpaceInvestigator();

        Investigator.setInputText("  Tiger  , running   over.\n78Not sure , if it does." +  "\nHave , a good day.\nFor example\nHello ! ) Greetings for a day! \\\" Fine !  ");

        Investigator.spaceInvestigator();
    }
}