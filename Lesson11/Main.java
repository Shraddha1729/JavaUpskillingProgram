package Lesson11;


class Appliance {
    boolean hasWorkToDo = false;
    public void performTask(String task) {
        if (hasWorkToDo) {
            System.out.println(task);
            hasWorkToDo = false;
        }
    }
}
class Refrigerator extends Appliance {
    public void pourMilk() {
        performTask("Pouring milk from the refrigerator.");
    }
}
class DishWasher extends Appliance {
    public void doDishes() {
        performTask("Cleaning the dishes in the dishwasher.");
    }
}
class CoffeeMaker extends Appliance {
    public void brewCoffee() {
        performTask("Brewing coffee.");
    }
}
class SmartKitchen {
    Refrigerator refrigerator = new Refrigerator();
    DishWasher dishWasher = new DishWasher();
    CoffeeMaker coffeeMaker = new CoffeeMaker();
    public void addWater() {
        coffeeMaker.hasWorkToDo = true;
    }
    public void pourMilk() {
        refrigerator.hasWorkToDo = true;
    }
    public void loadDishwasher() {
        dishWasher.hasWorkToDo = true;
    }
    public void doKitchenWork() {
        coffeeMaker.brewCoffee();
        refrigerator.pourMilk();
        dishWasher.doDishes();
    }
}

public class Main {
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();
        kitchen.addWater();
        kitchen.pourMilk();
        kitchen.loadDishwasher();
        kitchen.doKitchenWork();
    }
}
