package Medina_p5;


public class ContactItem {
    private String firstname;
    private String lastname;
    private String phone;
    private String email;


    public ContactItem(String firstname, String lastname, String phone, String email) {
        this.firstname = firstname;
        this. lastname = lastname;
        this.phone = phone;
        this.email = email;
    }

    public ContactItem() {
    }


    protected String getFirstName() {
        String firstname = this.firstname;
        return firstname;
    }

    protected String getLastName() {
        String lastname = this.lastname;
        return lastname;
    }

    protected String getPhoneNum() {
        String phone = this.phone;
        return phone;
    }

    protected String getEmailAdd() {
        String email = this.email;
        return email;
    }

    public static boolean isFirstValid(String firstname){
        return firstname.length()>0;
    }

    public static boolean isLastValid(String lastname){
        return lastname.length()>0;
    }

    public static boolean isPhoneValid(String phone){
        return phone.length()>0;
    }

    public static boolean isEmailValid(String email){
        return email.length()>0;
    }


}
