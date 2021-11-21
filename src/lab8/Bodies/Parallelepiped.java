package lab8.Bodies;

public class Parallelepiped implements GeometricBody
{
    private double baseSide1;
    private double baseSide2;
    private double side;
    private double height;

    public Parallelepiped(double baseSide1, double baseSide2, double side, double height)
    {
        this.baseSide1 = baseSide1;
        this.baseSide2 = baseSide2;
        this.side = side;
        this.height = height;
    }

    public double getBaseSide1()
    {
        return baseSide1;
    }

    public void setBaseSide1(double baseSide1)
    {
        this.baseSide1 = baseSide1;
    }

    public double getBaseSide2()
    {
        return baseSide2;
    }

    public void setBaseSide2(double baseSide2)
    {
        this.baseSide2 = baseSide2;
    }

    public double getSide()
    {
        return side;
    }

    public void setSide(double side)
    {
        this.side = side;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double basePerimeter()
    {
        return 2*(baseSide1+baseSide2);
    }
    public double baseArea()
    {
        return baseSide1*height;
    }
    @Override
    public double getSurface()
    {
        return (basePerimeter() * height) + (2 * baseArea());
    }

    @Override
    public double getVolume()
    {
        return baseArea()*height;
    }

    @Override
    public String toString()
    {
        return "Parallelepiped{" +
                "baseSide1=" + baseSide1 +
                ", baseSide2=" + baseSide2 +
                ", side=" + side +
                ", height=" + height +
                '}';
    }
}
