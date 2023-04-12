public class Doctor {
    int id;
    String name;
    Doctor(){
        System.out.println("ctor Doctor");
    }
    Doctor(String pName){
        System.out.println("ctor Doctor with name:"+pName);
    }
    //behaviors
    public void showName(){
        System.out.println(name);
    }
}
