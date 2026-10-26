package org.example;

public class CheeseRowCleaner
{
    public String clean (String s)
    {
        // if "text, text, text" remove commas
        for(int i = 0; i < s.length()-1; i++)
        {
            char c = s.charAt(i);
            if(c == '"')
            {
                int j = i + 1;
                while(s.charAt(j) != ('"'))
                {
                    if(s.charAt(j) == ',')
                    {
                        s = s.substring(0, j) + s.substring(j + 1);  // removing comma
                    }
                    else
                    {
                        j++;
                    }
                }
                i = j;
            }
        }

        // check for ,, and add white space
        for(int i = 0; i < s.length()-1; i++)
        {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            if(c1 == ',' && c2 == ',')
            {
                s = s.substring(0, i+1) + " " + s.substring(i+1);
            }
        }
        return s;
    }
}
