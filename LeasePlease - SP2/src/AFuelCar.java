public abstract class AFuelCar extends ACar { // Nedarve fra ACar
    protected int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre){
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }
    abstract String getFuelType();

    public int getKmPrLitre(){
        return kmPrLitre;

    }

  //  @Override
  //  public String toString() {
  //      return "Fuel Type: " + getFuelType() + ", Registration Number: " + getRegistrationNumber();
  //  }

}