package Service.impl;

import java.math.BigDecimal;
import Service.Service;
public class ServiceImpl implements Service {

    private String name;
    private String description;
    private BigDecimal price;
    private int durationMinutes;

    public ServiceImpl(String name, String description, BigDecimal price, int durationMinutes) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.durationMinutes = durationMinutes;
    }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public BigDecimal getPrice() { return price; }

    public int getDurationMinutes() { return durationMinutes; }
}
