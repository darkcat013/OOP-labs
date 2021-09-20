package lab1.task1;

public class Main
{
    public static void main(String[] args)
    {
        //Monitors
        System.out.println("\n==========================================\nMonitors\n==========================================\n");
        Monitor m1 = new Monitor();
        m1.color = "black";
        m1.dimensions = 16;
        m1.resolutionX = 1920;
        m1.resolutionY = 1080;
        System.out.println("First monitor: " + m1);
        Monitor m2 = new Monitor();
        m2.color = "white";
        m2.dimensions = 21;
        m2.resolutionX = 1920;
        m2.resolutionY = 1080;
        System.out.println("Second monitor: " + m2);
        System.out.println(m1.dimensions > m2.dimensions ? "First monitor is bigger" :
                (m1.dimensions == m2.dimensions ? "Monitors are of the same size" : "Second monitor is bigger"));
        System.out.println(m1.resolutionX == m2.resolutionX && m1.resolutionY == m2.resolutionY ? "Monitors have the same resolution" : "Monitors have different resolution");
    }
}
