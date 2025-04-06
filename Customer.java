package Lesson7;

public class Customer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public  Customer( String name, double creditLimit, String emailAddress)
    {
        this.name=name;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;
    }
    public Customer()
    {
        this("Test Customer1",6000.00,"Test1@abc.com");
    }
    public  Customer(String name, String emailAddress)
    {
        this(name, 6000.00, emailAddress);
    }
    public String getName()
    {
        return  name;
    }
    public double getCreditLimit()
    {
        return creditLimit;
    }
    public String getEmailAddress()
    {
        return emailAddress;
    }
}
