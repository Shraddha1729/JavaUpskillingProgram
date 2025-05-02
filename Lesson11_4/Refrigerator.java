package Lesson11_4;

public class Refrigerator {
    private boolean hasWorkToDo;


    public void setHasWorkToDo(boolean hasWork) {
        this.hasWorkToDo = hasWork;
    }


    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering food from the refrigerator.");
            hasWorkToDo = false;
        }
    }
}
