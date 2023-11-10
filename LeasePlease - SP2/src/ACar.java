    public abstract class ACar implements Car {
    final String registrationNumber;
    final String make;
    final String model;
    final int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors){
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    public abstract int getRegistrationFee();

    @Override
    public String toString() {
        return make + " - " + model + ": " + "\n" + "[Registration Number: " + registrationNumber +
                ", Make: " + make +
                ", Model: " + model +
                ", Number of Doors: " + numberOfDoors + "]" + "\n";
    }
}
