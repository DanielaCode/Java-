import java.util.Date;

public class Doctor {
    static int id=0;
    private String name;
    private String email;
    private String speciality;

    /*I need to put available appointments for doctors, so I create this:*/
    int idAvailableAppointments;
    private Date date;
    private String time;
    /*and then create a collection to list all the agenda*/

    Doctor(String pName, String pSpeciality){
        id++;
        this.name = pName;
        this.speciality = pSpeciality;
    }
    //behaviors
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("Id doctor:"+id);
    }
}
