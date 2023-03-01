public class Program {

    public static void main(String[] args) {
        Car car = new Car("автомобиль", 0, 0, 0, null, null, 0, 0, null);
        PassengerCar passengerCar = new PassengerCar("легковой автомобиль", 0, 0, 0, null, null, 0, 0, null, 0, 0);
        Bus bus = new Bus("Автобус", 0, 0, 0, null, null, 0, 0, null, null, 0, 0);

        System.out.println(car.getInfo());
        System.out.println(passengerCar.getInfo());
        System.out.println(bus.getInfo());

    }
}
