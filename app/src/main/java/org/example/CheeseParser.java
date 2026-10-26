package org.example;

public class CheeseParser
{
    public Cheese parse(String s)
    {
        // s was cleaned before parse was called.
        String[] parts = s.split(",");
        double percent = 0;
        if(!parts[3].equals(" "))
        {
            percent = Double.parseDouble(parts[3]);
        }
        String organicValue = parts[6];
        boolean organic = false;
        if (Integer.parseInt(organicValue) == 1)
        {
            organic = true;
        }
        Cheese ch = new Cheese(parts[0], percent, organic, parts[8], parts[9], parts[11]);
        return ch;
    }

}
