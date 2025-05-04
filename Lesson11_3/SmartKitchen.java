package Lesson11_3;

public class SmartKitchen {

    private CoffeeMaker brewMaster = new CoffeeMaker();
    private DishWasher dishWasher = new DishWasher();
    private Refrigerator iceBox = new Refrigerator();


    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean coffee, boolean fridge, boolean dishes) {
        brewMaster.setHasWorkToDo(coffee);
        iceBox.setHasWorkToDo(fridge);
        dishWasher.setHasWorkToDo(dishes);
    }
}
