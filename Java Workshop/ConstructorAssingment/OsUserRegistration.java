package ConstructorAssingment;

class OsUserRegistration {
    private String username;

    {
        System.out.println("Registration Process Started");
    }

    public OsUserRegistration() {
        this("Guest_User"); 
    }

    public OsUserRegistration(String username) {
        this.username = username;
        System.out.println("Username: " + this.username);
        System.out.println("Account Created Successfully");
    }

    public static void main(String[] args) {
        OsUserRegistration user = new OsUserRegistration("Rahul");
    }
}