import model.Doctor;
import model.IScheduable;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor d1= new Doctor("Daniela","daniela@gmail.com");
        //nested class justification: only doctor class can use it
        d1.addAvailableApointments(new Date(),"4pm");
        d1.addAvailableApointments(new Date(),"6pm");
        d1.addAvailableApointments(new Date(),"3pm");

        for (Doctor.AvailableAppointments aA: d1.getAvailableApointments()) {
            System.out.println("date: "+aA.getDate()+"time: "+aA.getTime());
        }

        Patient p1= new Patient("sofi","sofi@gmail.com");
        //here I can see the effect of use toString override
        System.out.println(p1);

        User u1 = new User("dani","dani¡gmail.com") {//this is a way to create an instance of an abstract class and is called anonymous classes  but their life cycle is only At this moment
            @Override
            public String showDataUser() {
                return null;
            }
        };

        IScheduable scheduable = new IScheduable() {//we can do the same with interfaces this is usually used on android to handle events
            @Override
            public void schedule(Date date, String time) {

            }
        };
    }
}