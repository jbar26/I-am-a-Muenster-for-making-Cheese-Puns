package org.example;

import java.util.ArrayList;

public class CheeseList
{
    private ArrayList<Cheese> cheeseList;

    public CheeseList()
    {
        cheeseList = new ArrayList<Cheese>();
    }

    public void addCheese(Cheese ch)
    {
        cheeseList.add(ch);
    }
    public int numberOfCheeses()
    {
        return cheeseList.size();
    }
    public Cheese getCheese(int index)
    {
        return cheeseList.get(index);
    }
}
