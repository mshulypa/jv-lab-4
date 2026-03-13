package Service.impl;
import Service.Equipment;

public class EquipmentImpl implements Equipment {

    private String name;
    private String engineType;
    private double engineVolume;
    private int horsePower;
    private String gearboxType;
    private String driveType;

    public EquipmentImpl(String name, String engineType, double engineVolume,
                         int horsePower, String gearboxType, String driveType) {
        this.name = name;
        this.engineType = engineType;
        this.engineVolume = engineVolume;
        this.horsePower = horsePower;
        this.gearboxType = gearboxType;
        this.driveType = driveType;
    }

    public String getName() { return name; }

    public String getEngineType() { return engineType; }

    public double getEngineVolume() { return engineVolume; }

    public int getHorsePower() { return horsePower; }

    public String getGearboxType() { return gearboxType; }

    public String getDriveType() { return driveType; }
}