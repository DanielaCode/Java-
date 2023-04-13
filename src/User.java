public class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) { //getters and setters let me validate the input value that will be assigned
        if (phoneNumber.length()>8){
            System.out.println("max 8 numbers");
        }else{
            this.phoneNumber = phoneNumber;
        }
    }

    @Override//override to string of Object
    public String toString() {
        return "name: "+name+"\n email: "+email +"\n number: "+phoneNumber;
    }
}
