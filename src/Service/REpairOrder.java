import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface REpairOrder {
    LocalDate getStartDate();
    LocalDate getEndDate();
    String getStatus();
    List<SparePart> getSpareParts();
    List<Service> getServices();
    Master getMaster();
    Car getCar();
    BigDecimal getTotalPrice();
}