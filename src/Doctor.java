import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id=0;
    private String name;
    private String email;
    private String speciality;

    ArrayList<AvailableAppointments> aA = new ArrayList<>();
    Doctor(String pName, String pSpeciality){
        id++;
        this.name = pName;
        this.speciality = pSpeciality;
    }
    //behaviors
    public void addAvailableApointments(Date date, String time){
        aA.add(new AvailableAppointments(date,time));
    }
    public ArrayList<AvailableAppointments> getAvailableApointments(){
        return aA;
    }
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("Id doctor:"+id);
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
