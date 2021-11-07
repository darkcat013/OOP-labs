package lab5.Task1;

public class B extends A
{
    public String b;

    public B(String all)
    {
        super(all);
        this.b = all;
    }

    public B(String a, String b)
    {
        super(a);
        this.b = b;
    }

    @Override
    public String toString()
    {
        return "B{" +
                "b='" + b + '\'' +
                "} " + super.toString();
    }
}
