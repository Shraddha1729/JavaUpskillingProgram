package Lesson7;

public class Account {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String email) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance = accountBalance + amount;
            System.out.println("Deposited amount: " + amount + " , New Balance Amount:" + accountBalance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount < accountBalance) {
            accountBalance = accountBalance - amount;
            System.out.println("Withdraw amount:" + amount + " , New Balance:" + accountBalance);
        } else
            System.out.println("Insufficient amount or funds for withdrawal");
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }


    public static void main(String[] args) {
        Account account = new Account("1234567890", 2000.00, "Test Customer", "Test@gmail.com", "4444 123456");
        account.displayAccountInfo();
        account.deposit(400.00);
        account.withdraw(200.00);
        account.displayAccountInfo();
    }
}


