package Lesson7;

public class MainClassForAccountAndCalculatorAndCustomer {
    public static void main(String[] args) {
        Account account = new Account("1234567890", 5000.00, "Test Customer", "Test@gmail.com", "4444 123456");
        System.out.println("Account information before deposit and Withdrawal");
        account.displayAccountInfo();
        account.deposit(500);
        account.withdraw(600);
        System.out.println("Account information after deposit and Withdrawal");
        account.displayAccountInfo();

        Calculator calculator=new Calculator();
        calculator.setFistNumber(4.0);
        calculator.setSecondNumber(6.0);

        //Calculator
        System.out.println("Addition = "+ calculator.getAdditionResult());
        System.out.println("Subtraction = "+ calculator.getSubtractionResult());
        System.out.println("Multiplication = " + calculator.getMultiplicationResult());
        System.out.println("Division = "+  String.format("%.2f", calculator.getDivisionResult()));

        //Customer

        Customer cusromer1=new Customer("TEST ABC",7000.00, "TEST@xyz.com");
        System.out.println("Customer Name : " + cusromer1.getName());
        System.out.println("Customer credit limit: " + cusromer1.getCreditLimit());
        System.out.println("Customer emmail address :"+ cusromer1.getEmailAddress());

        Customer customer2=new Customer();
        System.out.println("Name:"+ customer2.getName());
        System.out.println("Credit limit:"+ customer2.getCreditLimit());
        System.out.println("Email address:"+ customer2.getEmailAddress());

        Customer customer3=new Customer("TEST","TEST@abc.com");
        System.out.println("Name:"+ customer3.getName());
        System.out.println("Credit Limit:"+customer3.getCreditLimit());
        System.out.println(("email address:"+customer3.getEmailAddress()));



    }
}
