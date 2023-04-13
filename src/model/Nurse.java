package model;

public class Nurse extends User{
    private String speciality;
    public Nurse(String name, String email) {
        super(name, email);
    }

    @Override
    public String showDataUser() {
        return null;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
