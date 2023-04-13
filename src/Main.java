import model.Doctor;
import model.Patient;

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
    }
}