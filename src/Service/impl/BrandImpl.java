package Service.impl;
import Service.Brand;

public class BrandImpl implements Brand {

    private String name;
    private String country;

    public BrandImpl(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() { return name; }

    public String getCountry() { return country; }
}