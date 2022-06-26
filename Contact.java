/*
 * Robert Sanford
 * SNHU
 * CS 320
 * Module 3 Milestone
*/
public class Contact {
    

    private String contactID;
    private String firstName;
    private String lastName;
    private String number;
    private String address;

    public Contact(String contactID, String firstName, String lastName, String number, String address) {

        if(contactID == null || contactID.length() > 10) {
            throw new IllegalArgumentException("Contact ID is invalid, Null or length greater than 10");
        }
        if(firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First Name is invalid, Null or length greater than 10");
        }
        if(lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last Name is invalid, Null or length greater than 10");
        }
        if(number == null || number.length() > 10) {
            throw new IllegalArgumentException("Phone Number is invalid, Null or length greater than 10");
        }
        if(address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address is invalid, Null or length greater than 10");
        }

        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.address = address;
    }

    // getters
    public String getContactID() {
        return this.contactID;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getNumber() {
        return this.number;
    }
    public String getAddress() {
        return this.address;
    }

    // setters
    public void setContactID(String contactId) {
        this.contactID = contactID;
    }
    public void setFirstName(String fName) {
        this.firstName = firstName;
    }
    public void setLastName(String lName) {
        this.lastName = lastName;
    }
    public void setNumber(String num) {
        this.number = number;
    }
    public void setAddress(String addr) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact [" +
                "contactID = " + contactID  +
                ", firstName = " + firstName  +
                ", lastName = " + lastName  +
                ", Number = " + number +
                ", address = " + address  +
                ']';
    }
}
