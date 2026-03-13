package Service.impl;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import Service.REpairOrder;
import Service.SparePart;
import Service.Master;
import Service.Car;
import Service.Service;

public class REpairOrderImpl implements REpairOrder {

    private LocalDate startDate;
    private LocalDate endDate;
    private String status;
    private List<SparePart> spareParts;
    private List<Service> services;
    private Master master;
    private Car car;

    public REpairOrderImpl(LocalDate startDate, LocalDate endDate,
                           String status, List<SparePart> spareParts,
                           List<Service> services, Master master, Car car) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.spareParts = spareParts;
        this.services = services;
        this.master = master;
        this.car = car;
    }

    public LocalDate getStartDate() { return startDate; }

    public LocalDate getEndDate() { return endDate; }

    public String getStatus() { return status; }

    public List<SparePart> getSpareParts() { return spareParts; }

    public List<Service> getServices() { return services; }

    public Master getMaster() { return master; }

    public Car getCar() { return car; }

    public BigDecimal getTotalPrice() {

        BigDecimal servicesSum = services.stream()
                .map(Service::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal partsSum = spareParts.stream()
                .map(SparePart::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        return servicesSum.add(partsSum);
    }
}
