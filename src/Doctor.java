public class Doctor {
    static int id=0;/*autoincrement because each new doctor instance need to be another id autoincremented, static would help because makes this variable as a global scope any class can use it and the value is consistend betwen all the program*/
    String name;
    String email;
    String speciality;
    Doctor(String pName, String pSpecialyty){
        id++;
        this.name = pName;
        this.speciality = pSpecialyty;
    }
    //behaviors
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("Id doctor:"+id);
    }
}
