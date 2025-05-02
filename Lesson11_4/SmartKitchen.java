package Lesson11_4;

public class SmartKitchen {

    private CoffeeMaker brewMaster = new CoffeeMaker();
    private DishWasher dishWasher = new DishWasher();
    private Refrigerator iceBox = new Refrigerator();


    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }


    public void pourMilk() {
        iceBox.setHasWorkToDo(true);  // Set work for Refrigerator
    }


    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
    }


    public void setKitchenState(boolean coffee, boolean fridge, boolean dishes) {
        brewMaster.setHasWorkToDo(coffee);
        iceBox.setHasWorkToDo(fridge);
        dishWasher.setHasWorkToDo(dishes);
    }


    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
