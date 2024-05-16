package decorator_example;

public class main {
    public static void main (String[] args) {
        // Creating a base computer
        computerComponent baseComputer = new baseComputer("750 GB", "4 GB", 700);

        // Adding optional components using decorators
        computerComponent computerWithGraphicsCard = new graphicsCard(baseComputer, 150);
        computerComponent computerWithBluetooth = new Bluetooth(computerWithGraphicsCard, 50);

        // Output description and cost
        System.out.println("Computer Description: " + computerWithBluetooth.getDescription());
        System.out.println("Computer Cost: $" + computerWithBluetooth.getCost());
    }
}
