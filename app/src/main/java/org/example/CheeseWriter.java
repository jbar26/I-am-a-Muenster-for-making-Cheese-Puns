package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class CheeseWriter
{
    private String fileName;

    public CheeseWriter(String fileName)
    {
        this.fileName = fileName;
    }

    public void writeData(String string)
    {
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName) );
            writer.write(string + "\n");
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("There was a problem creating the output file.");
        }
    }

}
