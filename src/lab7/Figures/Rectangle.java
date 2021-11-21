package lab7.Figures;

public class Rectangle extends Figure
{
    private double base;
    private double side;

    public Rectangle(double base, double side)
    {
        this.base = base;
        this.side = side;
    }

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getSide()
    {
        return side;
    }

    public void setSide(double side)
    {
        this.side = side;
    }

    @Override
    public double getArea()
    {
        return base*side;
    }

    @Override
    public double getPerimeter()
    {
        return 2*(base+side);
    }

    @Override
    public String toString()
    {
        return "Rectangle{" +
                "base=" + base +
                ", side=" + side +
                "} ";
    }
}
