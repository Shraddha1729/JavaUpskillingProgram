package Lesson11_4;

public class Main {
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();
        kitchen.setKitchenState(true, true, false);
        System.out.println("Executing tasks via delegation:");
        kitchen.doKitchenWork();
    }
}

//other way

/*public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();
        kitchen.setKitchenState(true, true, false);
        System.out.println("Executing tasks via delegation:");
        kitchen.doKitchenWork();
    }
}*/



