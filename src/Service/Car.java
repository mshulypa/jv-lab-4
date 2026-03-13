package Service;

public interface Car {
    Brand getBrand();
    CarModel getModel();
    int getYear();
    Equipment getEquipment();
    String getVinCode();
    String getNumPlates();
    Client getOwner();
}
