public class Main {
    public static void main(String[] args) {
        Car car = new Car("Civic", "Honda", 2022, 25000.0, "Red", 10);
        System.out.println(car);

        car.sell(5);
        System.out.println(car.getQuantity());

        System.out.println(car.getModel());
        System.out.println(car.getBrand());
        System.out.println(car.getYear());
        System.out.println(car.getPrice());
        System.out.println(car.getColor());
        System.out.println(car.getQuantity());

        car.setModel("Accord");
        car.setPrice(30000.0);
        car.setQuantity(15);
        System.out.println(car);
    }
}