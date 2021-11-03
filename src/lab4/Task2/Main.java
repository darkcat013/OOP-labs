package lab4.Task2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    final static String file_name = "src/lab4/task2/three_expressions.txt";
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fin = new FileInputStream(file_name);
            Scanner scanner = new Scanner(fin);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                int left = 0;
                for (int i = 0; i < line.length(); i++)
                {
                    if(line.charAt(i) == '(') left++;
                    else if(line.charAt(i) == ')') left--;
                }
                if(left == 0) System.out.println(line + ": + parentheses are put correct");
                else System.out.println(line + ": - parentheses are put incorrect");
            }
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
