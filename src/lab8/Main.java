package lab8;

import lab7.FigureController;
import lab8.Bodies.Cube;
import lab8.Bodies.GeometricBody;
import lab8.Bodies.Parallelepiped;
import lab8.Bodies.Sphere;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        GeometricBody cube = new Cube(4.35);
        GeometricBody sphere = new Sphere(3);
        GeometricBody parallelepiped = new Parallelepiped(2,3,3,3);

        ArrayList<GeometricBody> bodies = new ArrayList<>();
        bodies.add(cube);
        bodies.add(sphere);
        bodies.add(parallelepiped);

        System.out.println("Body with biggest surface: " + GeometricBodyController.biggestSurface(bodies));
        System.out.println("Body with biggest volume: "+GeometricBodyController.biggestVolume(bodies));
    }
}
