package lab2.task2;

import java.util.ArrayList;

public class Queue<T>
{
    private ArrayList<T> elements;
    private int maxSize;
    private int size;

    public Queue()
    {
        maxSize=-1;
        elements = new ArrayList<>();
        size = 0;
    }

    public Queue(int maxSize)
    {
        this.maxSize=maxSize;
        elements = new ArrayList<>(maxSize);
        size = 0;
    }

    public int getSize()
    {
        return size;
    }

    public int getMaxSize()
    {
        return maxSize;
    }

    public void push(T element)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
        }
        else
        {
            elements.add(element);
            size++;
        }
    }

    public T pop()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return null;
        }
        else
        {
            size--;
            return elements.remove(0);
        }
    }

    public boolean isEmpty()
    {
        return size == 0;
    }
    public boolean isFull()
    {
        return (size == maxSize) && (maxSize!=-1);
    }
}
