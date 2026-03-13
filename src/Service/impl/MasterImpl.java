package Service.impl;
import Service.Master;
import Service.ServiceStation;

public class MasterImpl implements Master {

    private String fullName;
    private String specialization;
    private String phone;
    private int experienceYears;
    private ServiceStation serviceStation;

    public MasterImpl(String fullName, String specialization,
                      String phone, int experienceYears,
                      ServiceStation serviceStation) {
        this.fullName = fullName;
        this.specialization = specialization;
        this.phone = phone;
        this.experienceYears = experienceYears;
        this.serviceStation = serviceStation;
    }

    public String getFullName() { return fullName; }

    public String getSpecialization() { return specialization; }

    public String getPhone() { return phone; }

    public int getExperienceYears() { return experienceYears; }

    public ServiceStation getServiceStation() { return serviceStation; }
}
