package lab7;

import lab7.Figures.Figure;
import lab7.Figures.Rectangle;
import lab7.Figures.Square;
import lab7.Figures.Triangle;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Figure square = new Square(3);
        Figure rectangle = new Rectangle(2,3);
        Figure triangle = new Triangle(4,4,5);
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(square);
        figures.add(rectangle);
        figures.add(triangle);

        System.out.println("Figure with biggest perimeter: " + FigureController.biggestPerimeter(figures));
        System.out.println("Figure with biggest area: "+FigureController.biggestArea(figures));

        Figure circle = new Figure()
        {
            private double radius = 2.05;

            @Override
            public double getArea()
            {
                return Math.PI*radius*radius;
            }

            @Override
            public double getPerimeter()
            {
                return 2*Math.PI*radius;
            }

            @Override
            public String toString()
            {
                return "Circle{" +
                        "radius=" + radius +
                        "} ";
            }
        };
        System.out.println();
        System.out.println(circle + ": perimeter: " + circle.getPerimeter());
        System.out.println(circle + ": area: " + circle.getArea());

        figures.add(circle);

        System.out.println();
        System.out.println("Figure with biggest perimeter: " + FigureController.biggestPerimeter(figures));
        System.out.println("Figure with biggest area: "+FigureController.biggestArea(figures));
    }
}
