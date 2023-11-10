import java.util.ArrayList;
public class FleetOfCars {
    private final ArrayList<Car> fleet;

    public FleetOfCars() {

        fleet = new ArrayList<>();
    }

    public void addCar(Car car) {
        fleet.add(car);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Fleet of Cars:\n");
        for (Car car : fleet) {
            result.append(car.toString()).append("\n");
        }
        return result.toString();
    }

    public int getTotalRegistrationFeeForFleet() {
        int totalFee = 0;
        for (Car car : fleet) {
            totalFee += car.getRegistrationFee();
        }
        return totalFee;
    }



}