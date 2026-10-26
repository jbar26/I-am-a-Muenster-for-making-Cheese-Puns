package org.example;

public class CheeseAnalyzer
{
    public static void main(String[] args)
    {
        CheeseReader reader = new CheeseReader("cheese_data.csv");
        CheeseList list = reader.read_cheeses();

        // Perform calculations:
        String output = "";

        // Number of cheeses that use pasteurized milk and number using raw milk
        int numPasturized = 0;
        int numRaw = 0;
        for(int i = 0; i < list.numberOfCheeses(); i++)
        {
            if(list.getCheese(i).getMilkTreatment().equals("Pasteurized"))
            {
                numPasturized++;
            }
            else if(list.getCheese(i).getMilkTreatment().equals("Raw Milk"))
            {
                numRaw++;
            }
        }
        output += "\nNumber of cheeses that use pasteurized milk: " + numPasturized;
        output+= "\nNumber of cheeses that use raw milk: " + numRaw;


        // Number of organic cheeses that have a moisture percentage > 41%
        int numOrganic = 0;
        for(int i = 0; i < list.numberOfCheeses(); i++) {
            Cheese temp = list.getCheese(i);
            if (temp.getIsOrganic() && temp.getMoisturePercentage() > 41) {
                numOrganic++;
            }
        }
        output+= "\n\nThe number of organic cheeses that have a moisture percentage greater than 41%: " + numOrganic;


        // which type of animal milk do most cheeses come from?
        int numCow = 0;
        int numGoat = 0;
        int numEwe = 0;
        int numBuffalo = 0;

        for(int i = 0; i < list.numberOfCheeses(); i++)
        {
            String type = list.getCheese(i).getMilkType();
            if(type.equals("Cow"))
            {
                numCow++;
            }
            else if(type.equals("Goat"))
            {
                numGoat++;
            }else if(type.equals("Ewe"))
            {
                numEwe++;
            }
            else if(type.equals("Buffalo Cow"))
            {
                numBuffalo++;
            }
        }
        output +=("\n\nNumber of Cheeses with different milk types: ");
        output +=("\nCow: " + numCow);
        output +=("\nGoat: " + numGoat);
        output +=("\nEwe: " + numEwe);
        output +=("\nBuffalo: " + numBuffalo);
        output+=("\n\nIn Canada, most cheeses come from: ");
        if(numCow > numGoat && numCow>numEwe && numCow > numBuffalo)
        {
            output+=("Cow's milk.");
        }
        else if(numGoat > numCow && numGoat>numEwe && numGoat > numBuffalo)
        {
            output+=("Goat's milk.");
        }
        else if(numEwe > numCow && numEwe > numGoat && numEwe > numBuffalo)
        {
            output+=("Ewe's milk.");
        }
        else {
            output+=("Buffalo milk.");
        }


        // Write to file
        CheeseWriter writer = new CheeseWriter("output.txt");
        writer.writeData(output);

    }
}
