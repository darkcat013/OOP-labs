package lab1.task2;

import java.util.ArrayList;

public class UniversityFunctions
{
    static double universityAverage(University u)
    {
        double sum = 0;
        for (Student s : u.students)
        {
            sum += s.mark;
        }
        return sum / u.students.size();
    }
    static double universitiesAverage(ArrayList<University> universities)
    {
        double sum = 0;
        for (University u : universities)
        {
            sum+=universityAverage(u);
        }
        return sum/universities.size();
    }
}
