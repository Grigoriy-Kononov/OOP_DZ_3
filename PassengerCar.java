public class PassengerCar extends Car {

    private int trunkVolume;
    private double acceleration;

    public PassengerCar(String model, int yearOfRelease, int enginePower, int engineCapacity, String color, String fuel,
            int fuelConsumption, int maxSpeed, String carDrive, int trunkVolume, double acceleration) {
        super(model, yearOfRelease, enginePower, engineCapacity, color, fuel, fuelConsumption, maxSpeed, carDrive);
        this.trunkVolume = trunkVolume;
        this.acceleration = acceleration;
    }

    public PassengerCar(String fuel, int fuelConsumption, int maxSpeed, String carDrive, int trunkVolume,
            double acceleration) {
        super(fuel, fuelConsumption, maxSpeed, carDrive);
        this.trunkVolume = trunkVolume;
        this.acceleration = acceleration;
    }

    public String toString() {
        return String.format("%s,  объем багажника: %d, разгон до 100 км/ч: %.2f",
                super.getInfo(), this.trunkVolume, this.acceleration);
    }

    public String getInfo() {
        return String.format("%s,  объем багажника: %d, разгон до 100 км/ч: %.2f",
                super.getInfo(), this.trunkVolume, this.acceleration);
    }

    public int getTrunkVolume() {
        return trunkVolume;
    }

    public void setTrunkVolume(int trunkVolume) {
        this.trunkVolume = trunkVolume;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }
}
