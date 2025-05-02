package Lesson11_1;

public class Main {
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();


        kitchen.addWater();
        kitchen.pourMilk();
        kitchen.loadDishwasher();

        System.out.println("Executing work using getters:");
        kitchen.executeWorkViaGetters();
    }
}

abstract class Appliance {
    boolean hasWorkToDo = false;


    public abstract void performTask();
}

class Refrigerator extends Appliance {
    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering food from the refrigerator.");
            hasWorkToDo = false;
        }
    }

    @Override
    public void performTask() {
        orderFood();
    }
}

class DishWasher extends Appliance {
    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Cleaning the dishes in the dishwasher.");
            hasWorkToDo = false;
        }
    }
    @Override
    public void performTask() {
        doDishes();
    }
}

class CoffeeMaker extends Appliance {
    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing coffee.");
            hasWorkToDo = false;
        }
    }

    @Override
    public void performTask() {
        brewCoffee();
    }
}
class SmartKitchen {
    private Refrigerator refrigerator = new Refrigerator();
    private DishWasher dishWasher = new DishWasher();
    private CoffeeMaker coffeeMaker = new CoffeeMaker();
    public void addWater() {
        coffeeMaker.hasWorkToDo = true;
    }
    public void pourMilk() {
        refrigerator.hasWorkToDo = true;
    }
    public void loadDishwasher() {
        dishWasher.hasWorkToDo = true;
    }
    public void executeWorkViaGetters() {
        coffeeMaker.performTask();
        refrigerator.performTask();
        dishWasher.performTask();
    }
}


