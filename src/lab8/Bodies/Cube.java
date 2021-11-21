package lab8.Bodies;

public class Cube implements GeometricBody
{
    private double side;

    public Cube(double side)
    {
        this.side = side;
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
    public double getSurface()
    {
        return 6*side*side;
    }

    @Override
    public double getVolume()
    {
        return side*side*side;
    }

    @Override
    public String toString()
    {
        return "Cube{" +
                "side=" + side +
                "} ";
    }
}
