package App;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Buddy Info Class
 * @author Shoaib Khan
 * @studentID 101033582
 * @date 22/01/2020
 */
@Entity
public class BuddyInfo {
    private long id;
    public String name;
    private String address;
    private String phoneNumber;

    /**
     * Default Constructor
     */
    public BuddyInfo() {
    }

    /**
     * Constructor
     * @param name
     * @param address
     * @param phoneNumber
     */
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo(BuddyInfo buddy) {
        this.name = buddy.getName();
        this.address = buddy.getAddress();
        this.phoneNumber = buddy.getPhoneNumber();
    }

    /**
     * Method to set the unique Id of the buddy.
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Method to set the buddy's name.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to set the buddy's address.
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Method to set the buddy's phone number.
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Method to get the unique Id of the buddy.
     * The persistence provider should auto generate a unique Id for every buddy.
     * @return
     */
    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    /**
     * Method to get buddy's name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Method to get buddy's address
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Method to get buddy's phone number
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Method to print the buddy information
     */
    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Phone Number: " + this.phoneNumber);
    }

    /**
     * To String method
     * @return
     */
    public String toString() {
        return this.name + " " + this.address + " " + this.phoneNumber;
    }
}