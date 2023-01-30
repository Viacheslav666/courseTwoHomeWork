public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = verificationBrand(brand);
        this.model = (model == null || model == "" ? "default" : model);
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
        this.color = (color == null || color == "" ? "white" : color);
        this.year = (year <= 0 ? 2000 : year);
        this.country = (country == null || country == "" ? "default" : country);
    }

    public String verificationBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            brand =  "dedault";

        }
        this.brand = brand;
        return this.brand;
    }

    @Override
    public String toString() {

        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}

