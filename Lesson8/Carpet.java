package Lesson8;

public class Carpet {

    private double width;
    private  double length;
    public static double squareMeterCost=10.0;

    public Carpet (double width, double length)
    {
        this.width= (width >=0) ? width : 0;
        this.length= (length>=0) ? length : 0;
    }
    public double getArea()
    {
        return  width*length;
    }
    public double getTotalCost()
    {
    return  getArea()* squareMeterCost;
    }
}
