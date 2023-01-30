public class Main {
    public static Car car[] = new Car[5];

    public static void main(String[] args) {
        car[0] = new Car("Lada", "Granta", 1.6, "желтый", 2015, "Россия");
        car[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Black", 2020, "Germany");
        car[2] = new Car("BMW", "Z8", 3.0, "Black", 2021, "Россия");
        car[3] = new Car("KIA", "Sportage", 2.4, "Red", 2018, "South Korea");
        car[4] = new Car("Hundai", "Avante", 0, "Orange", 2016, "South Korea");
        for (Car car : car) {
            System.out.println("car = " + car);
        }
    }
}