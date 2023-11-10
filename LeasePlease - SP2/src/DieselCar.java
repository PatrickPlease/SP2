    public class DieselCar extends AFuelCar { // Nedarve fra AFuelCar
    final boolean hasParticleFilter;

    DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean hasParticleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.hasParticleFilter = hasParticleFilter;
    }

    @Override
    String getFuelType(){
        return "Diesel";
    }

    @Override
    public String toString() {
        return super.toString() +
                    " Fuel Type: " + getFuelType() + "\n" +
                    " Has Particle Filter: " + hasParticleFilter + "\n" +
                    " Registration Fee: " + getRegistrationFee() + "\n";
    }

    @Override
    public int getRegistrationFee(){
        int kmPerLitre = getKmPrLitre();
        int registrationFee = 0;

        if (kmPrLitre >= 20 && kmPrLitre <= 50){
            registrationFee = 130;
        } else if (kmPrLitre > 15 && kmPrLitre <= 20){
            registrationFee = 1390;
        } else if (kmPrLitre > 10 && kmPrLitre <= 15){
            registrationFee = 1850;
        } else if (kmPrLitre > 5 && kmPrLitre <= 10){
            registrationFee = 2770;
        } else {
            registrationFee = 15260;
        }

        if(!hasParticleFilter){
            registrationFee += 1000;
        }

        return registrationFee;
    }

    public int kmPrLitre() {
        return kmPrLitre;
    }

    boolean hasParticleFilter(){
        return  hasParticleFilter;
    }


}
