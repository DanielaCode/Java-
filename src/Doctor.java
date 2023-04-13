import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{

    private String speciality;

    ArrayList<AvailableAppointments> aA = new ArrayList<>();
    Doctor(String pName, String pEmail){
        super(pName,pEmail);
    }
    //behaviors
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public void addAvailableApointments(Date date, String time){
        aA.add(new AvailableAppointments(date,time));
    }
    public ArrayList<AvailableAppointments> getAvailableApointments(){
        return aA;
    }

    static public class AvailableAppointments{
        /*because I needed to create a class to make a collection of this the best solution was to create a class but because this class only will be used by this class doctor the best solution is a nested class*/
        int idAvailableAppointments;
        private Date date;
        private String time;

        public AvailableAppointments(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
