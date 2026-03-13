package Service.impl;
import java.math.BigDecimal;
import Service.SparePart;

public class SparePartImpl implements SparePart {

    private String name;
    private String manufacturer;
    private BigDecimal price;
    private int stockQuantity;

    public SparePartImpl(String name, String manufacturer, BigDecimal price, int stockQuantity) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getName() { return name; }

    public String getManufacturer() { return manufacturer; }

    public BigDecimal getPrice() { return price; }

    public int getStockQuantity() { return stockQuantity; }
}
