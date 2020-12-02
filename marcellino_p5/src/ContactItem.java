public class ContactItem {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

    // constructors
    public ContactItem() {

    }

    public ContactItem(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    // Getter and Setter methods
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmailAddress(){
        return emailAddress;
    }

    public void setFirstName(String newValue) {firstName = newValue;}
    public void setLastName(String newValue) {lastName = newValue;}
    public void setPhoneNumber(String newValue) {phoneNumber = newValue;}
    public void setEmailAddress(String newValue) {emailAddress = newValue;}

    public String toString() {
        return "Name: "+firstName +" "+ lastName +"\nPhone: "+ phoneNumber+"\nEmail: "+emailAddress;
    }

} // end TaskItem
