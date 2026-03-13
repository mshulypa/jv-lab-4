package Service.impl;
import Service.ServiceStation;

public class ServiceStationImpl implements ServiceStation {
    private String country;
    private String city;
    private String phone;
    private String email;
    private String owner;
    private String description;
    private int employeesQuantity;
    private String address;
    private ServiceStation serviceStation;

    public ServiceStationImpl(String country, String city,
                              String phone, String email, String owner,
                              String description,
                              int employeesQuantity, String address,
                              ServiceStation serviceStation) {
        this.country = country;
        this.city = city;
        this.phone = phone;
        this.email = email;
        this.owner = owner;
        this.description = description;
        this.employeesQuantity = getEmployeesQuantity();
        this.address = address;
        this.serviceStation = serviceStation;
    }

    public String getCountry() { return country; }

    public String getCity() { return city; }

    public String getPhone() { return phone; }

    public String getEmail() { return email; }

    public String getOwner() { return owner; }

    public String getDescription() { return description; }

    public String getAdress() { return address; }
    public int getEmployeesQuantity() { return employeesQuantity;}
    public ServiceStation getServiceStation() { return serviceStation; }
}