package lab7.Figures;

public class Triangle extends Figure
{
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle(double side1, double side2, double side3)
    {
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1))
        {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else
        {
            System.out.println("Triangle cannot exist with sides: " + side1 + " " + side2 + " " + side3 + ", Setting sides to 1 1 1");
        }
    }

    public double getSide1()
    {
        return side1;
    }

    public void setSide1(double side1)
    {
        this.side1 = side1;
    }

    public double getSide2()
    {
        return side2;
    }

    public void setSide2(double side2)
    {
        this.side2 = side2;
    }

    public double getSide3()
    {
        return side3;
    }

    public void setSide3(double side3)
    {
        this.side3 = side3;
    }

    @Override
    public double getArea()
    {
        double sp = getPerimeter() / 2;
        return Math.sqrt(sp * (sp - side1) * (sp - side2) * (sp - side3));
    }

    @Override
    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }

    @Override
    public String toString()
    {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                "} ";
    }
}
