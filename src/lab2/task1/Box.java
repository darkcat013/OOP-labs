package lab2.task1;

public class Box
{
    double width;
    double height;
    double depth;

    public Box()
    {
        width=1;
        height=1;
        depth=1;
    }
    public Box(double size)
    {
        width=height=depth=size;
    }
    public Box(double width, double height, double depth)
    {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double Area()
    {
        return width*height;
    }
    double Volume()
    {
        return Area()*depth;
    }
}
