/*
 * Robert Sanford
 * SNHU
 * CS 320
 * Module 3 Milestone
*/
 
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    @Test
    public void testAdd(){
        ContactService cs = new ContactService();
        Contact t1 = new Contact("T1", "Bob", "Smith", "12345", "123 Terrace Ave 12345");
        assertEquals(true, cs.addContact(t1));
    }

    @Test
    public void testDelete(){

        ContactService cs = new ContactService();

        Contact t1 = new Contact("T1", "Bob", "Smith", "123456", "123 Terrace Ave 123456");
        Contact t2 = new Contact("T2", "Britney", "Smith", "1234567", "123 Terrace Ave 1234567");
        Contact t3 = new Contact("T3", "Ben", "Smith", "12345678", "123 Terrace Ave 12345678");

        cs.addContact(t1);
        cs.addContact(t2);
        cs.addContact(t3);

        assertEquals(false, cs.deleteContact("T002"));
        assertEquals(false, cs.deleteContact("T000"));
        assertEquals(false, cs.deleteContact("T002"));
    }

    @Test
    public void testUpdate(){
        ContactService cs = new ContactService();

        Contact t1 = new Contact("T1", "Bob", "Smith", "123456", "123 Terrace Ave 123456");
        Contact t2 = new Contact("T2", "Britney", "Smith", "1234567", "123 Terrace Ave 1234567");
        Contact t3 = new Contact("T3", "Ben", "Smith", "12345678", "123 Terrace Ave 12345678");

        cs.addContact(t1);
        cs.addContact(t2);
        cs.addContact(t3);

        assertEquals(true, cs.updateContact("T2", "Britney", "Smith", "1234567", "123 Terrace Ave 1234567"));
        assertEquals(true, cs.updateContact("T3", "Ben", "Smith", "12345678", "123 Terrace Ave 12345678"));
    }

}
