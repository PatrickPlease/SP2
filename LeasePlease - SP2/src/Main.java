public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();

        GasolineCar gasolineCar = new GasolineCar("YHZ727", "Audi", "A6", 4, 18);
        ElectricCar electricCar = new ElectricCar("CND432", "Tesla", "VinFast 9", 5, 123, 520);
        DieselCar dieselCar = new DieselCar("POP400", "Volkswagen", "Golf", 5, 25, true);
        GasolineCar gasolineCar2 = new GasolineCar("IPB989", "Ferrari", "458 Italia", 2, 8);

        // Tilføjer til fleet
        fleet.addCar(gasolineCar);
        fleet.addCar(electricCar);
        fleet.addCar(dieselCar);
        fleet.addCar(gasolineCar2);

        // Navn
        System.out.println("\n Welcome to LeasePlease - SP2");
        System.out.println("--------------------------------");

        // Printer total registration fee for fleeten
        int totalFee = fleet.getTotalRegistrationFeeForFleet();
        System.out.println("\n" + "Total Registration Fee for Fleet: " + totalFee + "\n");


        // Printer infomation om bilerne
        System.out.println(dieselCar);
        System.out.println(electricCar);
        System.out.println(gasolineCar);
        System.out.println(gasolineCar2);
    }
}
