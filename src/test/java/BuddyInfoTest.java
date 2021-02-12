import App.BuddyInfo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * App.BuddyInfo Test
 * @author Shoaib Khan
 * @studentID 101033582
 * @date 22/01/2020
 */

public class BuddyInfoTest {
    BuddyInfo buddy;
    String name = "Shoaib";
    String address = "170 Boat House";
    String phoneNumber = "(613)-131-3213";

    /**
     * Method to test set name
     */
    @Test
    public void setName() {
        buddy = new BuddyInfo();
        buddy.setName(name);
        assertEquals(name, buddy.getName());
    }

    /**
     * Method to test set address
     */
    @Test
    public void setAddress() {
        buddy = new BuddyInfo();
        buddy.setAddress(address);
        assertEquals(address, buddy.getAddress());
    }

    /**
     * Method to test set phone number
     */
    @Test
    public void setPhoneNumber() {
        buddy = new BuddyInfo();
        buddy.setPhoneNumber(phoneNumber);
        assertEquals(phoneNumber, buddy.getPhoneNumber());
    }

    /**
     * Method to test get name
     */
    @Test
    public void getName() {
        buddy = new BuddyInfo(name, address, phoneNumber);
        assertEquals(name, buddy.getName());
    }

    /**
     * Method to test get address
     */
    @Test
    public void getAddress() {
        buddy = new BuddyInfo(name, address, phoneNumber);
        assertEquals(address, buddy.getAddress());
    }

    /**
     * Method to test get phone number
     */
    @Test
    public void getPhoneNumber() {
        buddy = new BuddyInfo(name, address, phoneNumber);
        assertEquals(phoneNumber, buddy.getPhoneNumber());
    }
}