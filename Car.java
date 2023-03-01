public class Car extends Transport {

    private String fuel;
    private int fuelConsumption;
    private int maxSpeed;
    private String carDrive;

    public Car(String model, int yearOfRelease, int enginePower, int engineCapacity, String color, String fuel,
            int fuelConsumption, int maxSpeed, String carDrive) {
        super(model, yearOfRelease, enginePower, engineCapacity, color);
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.carDrive = carDrive;
    }

    public Car(String fuel, int fuelConsumption, int maxSpeed, String carDrive) {
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.carDrive = carDrive;
    }

    public String toString() {
        return String.format("%s,  топливо: %s, расход топлива: %d, максимальная скорость: %d, привод автомобиля: %s",
                super.getInfo(), this.fuel, this.fuelConsumption, this.maxSpeed, this.carDrive);
    }

    public String getInfo() {
        return String.format("%s,  топливо: %s, расход топлива: %d, максимальная скорость: %d, привод автомобиля: %s",
                super.getInfo(), this.fuel, this.fuelConsumption, this.maxSpeed, this.carDrive);
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCarDrive() {
        return carDrive;
    }

    public void setCarDrive(String carDrive) {
        this.carDrive = carDrive;
    }

}
