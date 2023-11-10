public class ElectricCar extends ACar{ // Nedarve fra ACar
    final int batteryCapacity;
    final int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange){
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh(){
        return batteryCapacity;
    }

    public int getMaxRangeKm(){
        return maxRange;
    }

    public int getWhPrKm(){ // Udregner Kw til W
        return (batteryCapacity * 1000) / maxRange;
    }

    public double getKmPerLiter() { // Omregner til Km/l
        double whPerKm = getWhPrKm();
        double kmPerLiter = 100 / (whPerKm / 91.25);
        return kmPerLiter;
    }

    public int getRegistrationFee() {
        double kmPerLiter = getKmPerLiter();

        if (kmPerLiter >= 20 && kmPerLiter <= 50) {
            return 330;
        } else if (kmPerLiter > 15 && kmPerLiter <= 20) {
            return 1050;
        } else if (kmPerLiter > 10 && kmPerLiter <= 15) {
            return 2340;
        } else if (kmPerLiter > 5 && kmPerLiter <= 10) {
            return 5500;
        } else {
            return 10470;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                " Battery Capacity: " + batteryCapacity  + "\n" +
                " kWh Max Range: " + maxRange + "\n" +
                " km/l: " + getKmPerLiter() + "\n" +
                " Registration Fee: " + getRegistrationFee() + "\n";
    }
}
