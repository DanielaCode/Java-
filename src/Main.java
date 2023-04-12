// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name="Daniela Gutierrez";
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDoctor2 = new Doctor();
        myDoctor2.showId();

        //I can increment this static value and the next doctor will be id 4 this can show the global scope
        Doctor.id++;
        System.out.println("incrementing id everywhere: "+Doctor.id);

        Doctor myDoctor3 = new Doctor();
        myDoctor3.showId();
    }
}