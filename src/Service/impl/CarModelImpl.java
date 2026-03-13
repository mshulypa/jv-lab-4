package Service.impl;
import Service.CarModel;
import Service.Brand;

public class CarModelImpl implements CarModel {

    private String name;
    private String generation;
    private String bodyType;
    private Brand brand;

    public CarModelImpl(String name, String generation, String bodyType, Brand brand) {
        this.name = name;
        this.generation = generation;
        this.bodyType = bodyType;
        this.brand = brand;
    }

    public String getName() { return name; }

    public String getGeneration() { return generation; }

    public String getBodyType() { return bodyType; }

    public Brand getBrand() { return brand; }
}