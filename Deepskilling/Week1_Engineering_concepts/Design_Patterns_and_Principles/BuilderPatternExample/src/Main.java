public class Main {
    public static void main(String[] args) {
        
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();
        System.out.println("Basic Computer:");
        basicComputer.displaySpecs();

        System.out.println("\n-------------------------\n");

        
        Computer gamingComputer = new Computer.Builder("AMD Ryzen 9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .build();
        System.out.println("Gaming Computer:");
        gamingComputer.displaySpecs();
    }
}
