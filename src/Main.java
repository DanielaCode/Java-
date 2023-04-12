import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor d1= new Doctor("Daniela","pediatry");
        Patient p1=new Patient("Sofi","sofi@gmail.com");
        p1.setPhoneNumber("12345678");
        System.out.println(p1.getPhoneNumber());
    }
}