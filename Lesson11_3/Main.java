package Lesson11_3;

public class Main {

    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

        kitchen.addWater();
        kitchen.pourMilk();
        kitchen.loadDishwasher();

        System.out.println("Executing tasks via direct access:");
        kitchen.getBrewMaster().brewCoffee();
        kitchen.getIceBox().orderFood();
        kitchen.getDishWasher().doDishes();
    }
}
