package App;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 * Address Book Class
 * @author Shoaib Khan
 * @studentID 101033582
 * @date 22/01/2020
 */

@Entity
public class AddressBook {
	
	private Long id;
	private String name;
	private List<BuddyInfo> buddies = new ArrayList<BuddyInfo>();

	/**
	 * Default constructor
	 */
	public AddressBook() {
		super();
	}

	/**
	 * Method to return address book size
	 * @return
	 */
	public int size() {
		return buddies.size();
	}

	/**
	 * Method to set the unique Id of the address book.
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Method to set the address book name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Method to set the address book
	 * @param addressBook
	 */
	public void setBuddies(List<BuddyInfo> addressBook) {
		buddies = addressBook;
	}

	/**
	 * Method to get the unique Id of the address book.
	 * The persistence provider should auto generate a unique Id for each address book.
	 * @return
	 */
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	/**
	 * Method to retrive the address book name
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method to get the address book
	 * @return
	 */
	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	public List<BuddyInfo> getBuddies() {
		return buddies;
	}

	/**
	 * Method to add a buddy to the address book
	 * @param newBuddy
	 */
	public void addBuddy(BuddyInfo newBuddy) {
		buddies.add(newBuddy);
	}

	/**
	 * Method to remove a buddy from the address book
	 * @param buddy
	 */
	public void removeBuddy(BuddyInfo buddy) {
		// Remove the buddy from the address book if it exists.
		if (buddies.contains(buddy)) {
			buddies.remove(buddy);
		}
	}
}