package lab7;

import lab7.Figures.Figure;

import java.util.ArrayList;

public class FigureController
{
    public static Figure biggestArea(ArrayList<Figure> figures)
    {
        if(figures.isEmpty()) return null;
        Figure biggest = figures.get(0);
        for (Figure figure: figures)
        {
            if(biggest.getArea()<figure.getArea()) biggest=figure;
        }
        return biggest;
    }
    public static Figure biggestPerimeter(ArrayList<Figure> figures)
    {
        if(figures.isEmpty()) return null;
        Figure biggest = figures.get(0);
        for (Figure figure: figures)
        {
            if(biggest.getPerimeter()<figure.getPerimeter()) biggest=figure;
        }
        return biggest;
    }
}
