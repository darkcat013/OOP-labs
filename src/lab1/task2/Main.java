package lab1.task2;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        //Students and universities
        System.out.println("\n==========================================\nStudents and Universities\n==========================================\n");
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 9; i++)
        {
            Student s = new Student();
            s.name = "lab1.task2.Student" + (i + 1);
            s.age = 18 + i / 3;
            s.mark = i + 1;
            students.add(s);
        }
        ArrayList<University> universities = new ArrayList<>();
        for (int i = 0; i < 3; i++)
        {
            University u = new University();
            u.name = "lab1.task2.University" + (i + 1);
            u.foundationYear = 2000 + i;
            for (int j = 0; j < 3; j++)
            {
                u.students.add(students.get(i * 3 + j));
            }
            universities.add(u);
            System.out.println("Students in " + universities.get(i).name);
            for (int j = 0; j < universities.get(i).students.size(); j++)
            {
                System.out.println(universities.get(i).students.get(j));
            }
            System.out.println("Average marks of students in " + universities.get(i).name + ":");
            System.out.println(UniversityFunctions.universityAverage(universities.get(i)));
            System.out.println();
        }
        System.out.println("Average marks of students in all universities: ");
        System.out.println(UniversityFunctions.universitiesAverage(universities));
    }
}


