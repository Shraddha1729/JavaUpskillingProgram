package Lesson7;

public class Calculator {

    private double fistNumber;
    private double secondNumber;

    public double getFistNumber() {
        return fistNumber;
    }
    public void setFistNumber(double fistNumber)
    {
        this.fistNumber=fistNumber;
    }
    public double getSecondNumber()
    {
        return secondNumber;
    }
    public void setSecondNumber(double secondNumber)
    {
        this.secondNumber=secondNumber;
    }
    public double getAdditionResult()
    {
        return fistNumber+secondNumber;
    }
    public  double getSubtractionResult()
    {return fistNumber - secondNumber;
    }
    public  double getMultiplicationResult()
    {
        return fistNumber * secondNumber;
    }
    public  double getDivisionResult()
    {
        if(secondNumber==0)
        {
            return 0.0;
        }
        else
        {
            return fistNumber/secondNumber;
        }
    }


}
