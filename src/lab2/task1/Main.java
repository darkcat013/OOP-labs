package lab2.task1;

public class Main
{
    public static void main(String[] args)
    {
        Box box1 = new Box();
        Box box2 = new Box(3);
        Box box3 = new Box(3,6,9);

        System.out.println("First box Area: " + box1.Area() + ", and Volume: "+box1.Volume());
        System.out.println("Second box Area: " + box2.Area() + ", and Volume: "+box2.Volume());
        System.out.println("Third box Area: " + box3.Area() + ", and Volume: "+box3.Volume());
    }
}
