import Transport.Car;

public class Main {
    public static Car car[] = new Car[5];

    public static void main(String[] args) {
        car[0] = new Car("null", "Granta", 1.6, "желтый", 2015, "Россия", "AKPP", 5, false, null);
        car[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Black", 2020, "Germany", "AKPP", 5, false, new Car.Key(false,false));
        car[2] = new Car("BMW", "Z8", 3.0, "Black", 2021, "Россия", "AKPP", 5, false,null);
        car[3] = new Car("KIA", "Sportage", 2.4, "Red", 2018, "South Korea", "AKPP", 5, false,null);
        car[4] = new Car("Hundai", "Avante", 0, "Orange", 2016, "South Korea", "AKPP", 5, false, null);
        for (Car car : car) {
            System.out.println("car = " + car);
        }
    }
}