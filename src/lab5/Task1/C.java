package lab5.Task1;

public class C extends B
{
    public String c;

    public C(String all)
    {
        super(all);
        this.c = all;
    }

    public C(String a, String b, String c)
    {
        super(a, b);
        this.c = c;
    }

    @Override
    public String toString()
    {
        return "C{" +
                "c='" + c + '\'' +
                "} " + super.toString();
    }
}
