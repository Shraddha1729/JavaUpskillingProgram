package Lesson11_4;

public class CoffeeMaker {



    private boolean hasWorkToDo;


    public void setHasWorkToDo(boolean hasWork) {
        this.hasWorkToDo = hasWork;
    }


    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing coffee.");
            hasWorkToDo = false;
        }
    }
}
