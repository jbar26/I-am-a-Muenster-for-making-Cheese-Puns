package org.example;

public class Cheese
{
    private String id;
    private String name; // not needed but I want to include it.
    private double moisturePercentage;
    private boolean isOrganic;
    private String milkType;
    private String milkTreatment;

    Cheese(String id, double moisturePercentage, boolean isOrganic, String milkType, String milkTreatment, String name)
    {
        this.id = id;
        this.moisturePercentage = moisturePercentage;
        this.isOrganic = isOrganic;
        this.milkType = milkType;
        this.milkTreatment = milkTreatment;
        this.name = name;
    }
    public String getId() { return id;}
    public double getMoisturePercentage() {return moisturePercentage; }
    public boolean getIsOrganic() { return isOrganic;}
    public String getMilkType() { return milkType;}
    public String getMilkTreatment() { return milkTreatment;}
    public String getName(){return name;}

}
