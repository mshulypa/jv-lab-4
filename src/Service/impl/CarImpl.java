package Service.impl;

import Service.Brand;
import Service.Car;
import Service.CarModel;
import Service.Client;
import Service.Equipment;

public class CarImpl implements Car {

    private Brand brand;
    private CarModel model;
    private int year;
    private Equipment equipment;
    private String vin;
    private String licensePlate;
    private Client owner;

    public CarImpl(Brand brand, CarModel model, int year,
                   Equipment equipment, String vin,
                   String licensePlate, Client owner) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.equipment = equipment;
        this.vin = vin;
        this.licensePlate = licensePlate;
        this.owner = owner;
    }

    @Override
    public Brand getBrand() { return brand; }

    @Override
    public CarModel getModel() { return model; }

    @Override
    public int getYear() { return year; }

    @Override
    public Equipment getEquipment() { return equipment; }

    @Override
    public String getVinCode() { return vin; }

    @Override
    public String getNumPlates() { return licensePlate; }

    @Override
    public Client getOwner() { return owner; }
}
