package Lesson11_4;

public class DishWasher {
    private boolean hasWorkToDo;

    
    public void setHasWorkToDo(boolean hasWork) {
        this.hasWorkToDo = hasWork;
    }


    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Washing dishes.");
            hasWorkToDo = false;
        }
    }
}

