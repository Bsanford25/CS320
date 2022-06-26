/*
 * Robert Sanford
 * SNHU
 * CS 320
 * Module 3 Milestone
*/

import java.util.ArrayList;

public class ContactService {

    private ArrayList<Contact> listOfContacts;

    public ContactService() {
        listOfContacts = new ArrayList<>();
    }

    public boolean addContact(Contact a) {
        boolean contactExist = false;

        for(Contact l:listOfContacts) {
            if(l.equals(a)) {
                contactExist = true;
            }
        }
        if(!contactExist) {
            listOfContacts.add(a);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean deleteContact(String contactID) {

        for(Contact l:listOfContacts) {
            if(l.getContactID().equals(contactID)) {
                listOfContacts.remove(l);
                return true;
            }
        }
        return false;

    }

    public boolean updateContact(String contactID, String firstName, String lastName, String number, String address) {
        for(Contact l:listOfContacts) {
            if(l.getContactID().equals(contactID)) {
                if(!firstName.equals("") && (firstName.length() > 10)) {
                    l.setFirstName(firstName);
                }
                if(!lastName.equals("") && (lastName.length() > 10)) {
                    l.setLastName(lastName);
                }
                if(!number.equals("") && (number.length() > 10)) {
                    l.setNumber(number);
                }
                if(!address.equals("") && address.length() > 30) {
                    l.setAddress(address);
                }
                return true;
            }
        }
        return false;
    }

}