package App;

import App.AddressBook;
import App.BuddyInfo;

import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * App.AddressBook Test
 * @author Shoaib Khan
 * @studentID 101033582
 * @date 22/01/2020
 */
public class AddressBookTest {
    AddressBook addressBook;
    BuddyInfo buddy1 = new BuddyInfo("Daniel", "1600 Pen Ave", "(613)-991-2563");
    BuddyInfo buddy2 = new BuddyInfo("Shoaib", "1700 Boat House", "(613)-131-3213");

    /**
     * Method to test size
     */
    @org.junit.Test
    public void size() {
        addressBook = new AddressBook();
        addressBook.addBuddy(buddy1);
        addressBook.addBuddy(buddy2);
        assertEquals(2, addressBook.size());
    }

    /**
     * Method to test set address book
     */
    @org.junit.Test
    public void setAddressBook() {
        AddressBook newBook = new AddressBook();
        ArrayList<BuddyInfo> addresses = new ArrayList<>();
        addresses.add(buddy1);
        addresses.add(buddy2);

        addressBook = new AddressBook();
        addressBook.setBuddies(addresses);
        assertEquals(2, addressBook.size());
    }

    /**
     * Method to test get address book
     */
    @org.junit.Test
    public void getAddressBook() {
        addressBook = new AddressBook();
        addressBook.addBuddy(buddy1);
        addressBook.addBuddy(buddy2);

        ArrayList<BuddyInfo> addresses = new ArrayList<>();
        addresses.add(buddy1);
        addresses.add(buddy2);

        assertEquals(addresses, addressBook.getBuddies());
    }

    /**
     * Method to test add buddy
     */
    @org.junit.Test
    public void addBuddy() {
        addressBook = new AddressBook();

        addressBook.addBuddy(buddy1);
        assertEquals(1, addressBook.size());

        addressBook.addBuddy(buddy2);
        assertEquals(2, addressBook.size());
    }

    /**
     * Method to test remove buddy
     */
    @org.junit.Test
    public void removeBuddy() {
        addressBook = new AddressBook();
        addressBook.addBuddy(buddy1);
        addressBook.addBuddy(buddy2);

        addressBook.removeBuddy(buddy1);
        assertEquals(1, addressBook.size());

        addressBook.removeBuddy(buddy2);
        assertEquals(0, addressBook.size());
    }
}