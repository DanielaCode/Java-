import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor d1= new Doctor("Daniela","pediatry");
        Patient p1=new Patient("Sofi","sofi@gmail.com");
        p1.setPhoneNumber("12345678");
        System.out.println(p1.getPhoneNumber());

        /*differences between object and variables
        * objects are stored on heap for example
        * Doctor d1=new Doctor(); here d1 is a variable that is stored on the stack and have de address of the object doctor that is created on the heap
        * so if var d2=d1; I made a copy of the memory address of the object not the object
        * */

    }
}