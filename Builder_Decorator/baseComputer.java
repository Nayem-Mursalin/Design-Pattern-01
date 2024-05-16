package decorator_example;

public class baseComputer implements computerComponent{


    private String HDD;
    private String RAM;
    private double Cost;

    public baseComputer(String HDD, String RAM, double Cost){
        this.HDD = HDD;
        this.RAM = RAM;
        this.Cost = Cost;
    }

    @Override
    public String getDescription() {
       return "HDD: " + HDD + " RAM: " + RAM;
    }

    @Override
    public double getCost() {
       return Cost;
    }
    
}
