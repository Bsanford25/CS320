/*
 * Robert Sanford
 * SNHU
 * CS 320
 * Module 3 Milestone
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContactTest {
    Contact contact = new Contact("1", "firstName", "lastName", "123456789", "123 Avenue Blvd. 123456789");

    @Test
    void getContactID() {
        assertEquals("1", contact.getContactID());
    }
    @Test
    void getFirstName() {
        assertEquals("firstName", contact.getFirstName());
    }
    @Test
    void getLastName() {
        assertEquals("lastName", contact.getLastName());
    }
    @Test
    void getNumber() {
        assertEquals("123456789", contact.getNumber());
    }
    @Test
    void getAddress() {
        assertEquals("123 Avenue Blvd. 123456789", contact.getAddress());
    }
    @Test
    void testToString() {
        assertEquals("Contact [contactID = 1, firstName = firstName, lastName = lastName, Number = 123456789, address = 123 Avenue Blvd. 123456789]", contact.toString());
    }
}