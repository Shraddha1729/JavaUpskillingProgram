package Lesson11_4;

public class DishWasher {
    private boolean hasWorkToDo;

    // Sets the work status for DishWasher
    public void setHasWorkToDo(boolean hasWork) {
        this.hasWorkToDo = hasWork;
    }

    // Method to wash dishes, which prints a message if work is assigned
    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Washing dishes.");
            hasWorkToDo = false; // Reset the flag after work is done
        }
    }
}

