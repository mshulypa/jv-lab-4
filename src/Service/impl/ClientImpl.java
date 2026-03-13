package Service.impl;
import Service.Client;

public class ClientImpl implements Client {

    private String fullName;
    private String phone;
    private String email;
    private String address;

    public ClientImpl(String fullName, String phone, String email, String address) {
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getAddress() {
        return address;
    }
}