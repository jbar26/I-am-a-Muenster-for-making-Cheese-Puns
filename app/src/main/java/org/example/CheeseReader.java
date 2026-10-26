package org.example;

import java.io.BufferedReader;
import java.io.FileReader;

public class CheeseReader
{
    private String fileName;
    private CheeseParser parser = new CheeseParser();
    private CheeseRowCleaner cleaner = new CheeseRowCleaner();

    public CheeseReader(String fileName)
    {
        this.fileName = fileName;
    }

    public CheeseList read_cheeses()
    {
        CheeseList result = new CheeseList();
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine(); // consumes first line of headers in CSV file
            while((line = reader.readLine()) != null)
            {
                Cheese ch = deserializeCheese((line));
                result.addCheese(ch);
            }
            reader.close();
        }
        catch (Exception e)
        {
            System.out.println("Problem opening the file. Filename: " + fileName);
        }
        return result;
    }

    private Cheese deserializeCheese(String line)
    {
        String cleanedLine = cleaner.clean(line);
        Cheese cheese = parser.parse(cleanedLine);
        return cheese;
    }
}
