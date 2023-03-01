public class Bus extends Car {

    private String routeCategory;
    private int capacity;
    private int fare;

    public Bus(String model, int yearOfRelease, int enginePower, int engineCapacity, String color, String fuel,
            int fuelConsumption, int maxSpeed, String carDrive, String routeCategory, int capacity, int fare) {
        super(model, yearOfRelease, enginePower, engineCapacity, color, fuel, fuelConsumption, maxSpeed, carDrive);
        this.routeCategory = routeCategory;
        this.capacity = capacity;
        this.fare = fare;
    }

    public Bus(String fuel, int fuelConsumption, int maxSpeed, String carDrive, String routeCategory, int capacity,
            int fare) {
        super(fuel, fuelConsumption, maxSpeed, carDrive);
        this.routeCategory = routeCategory;
        this.capacity = capacity;
        this.fare = fare;
    }

    public String toString() {
        return String.format("%s,  категория маршрута: %s, вместимость автобуса: %d, стоимость проезда: %d",
                super.getInfo(), this.routeCategory, this.capacity, this.fare);
    }

    public String getInfo() {
        return String.format("%s,  категория маршрута: %s, вместимость автобуса: %d, стоимость проезда: %d",
                super.getInfo(), this.routeCategory, this.capacity, this.fare);
    }

    public String getRouteCategory() {
        return routeCategory;
    }

    public void setRouteCategory(String routeCategory) {
        this.routeCategory = routeCategory;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }
}
