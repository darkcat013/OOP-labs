package lab1.task2;

public class Student
{
    public String name;
    public int age;
    public double mark;

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }
}
