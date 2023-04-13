public class Patient extends User{//in java you can not do multiple inheritance but all in java is a child of object class that have a lot of prebuilt methods that I can use everywhere

    private String birthday;
    private double weight;
    private double height;
    private String blood;
    Patient(String name, String email){
        super(name,email);
    }
//to add getters and setters cmnd +n


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return weight+"kg"; //getters and setters let me put a format to the value and validate
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override//override to string of user
    public String toString() {
        return super.toString() + "\n blood: "+blood;
    }
}
