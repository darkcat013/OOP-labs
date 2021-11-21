package lab8;

import lab8.Bodies.GeometricBody;

import java.util.ArrayList;

public class GeometricBodyController
{
    public static GeometricBody biggestSurface(ArrayList<GeometricBody> bodies)
    {
        if(bodies.isEmpty()) return null;
        GeometricBody biggest = bodies.get(0);
        for (GeometricBody body: bodies)
        {
            if(biggest.getSurface()<body.getSurface()) biggest=body;
        }
        return biggest;
    }
    public static GeometricBody biggestVolume(ArrayList<GeometricBody> bodies)
    {
        if(bodies.isEmpty()) return null;
        GeometricBody biggest = bodies.get(0);
        for (GeometricBody body: bodies)
        {
            if(biggest.getVolume()<body.getVolume()) biggest=body;
        }
        return biggest;
    }
}
