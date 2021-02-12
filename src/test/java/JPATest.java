import App.AddressBook;
import App.BuddyInfo;
import org.junit.Test;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * JPA Test
 * @author Shoaib Khan
 * @studentID 101033582
 * @date 22/01/2020
 */
public class JPATest {

    @Test
    public void performJPA() {

        // Initialize and create two buddies
        BuddyInfo buddy1 = new BuddyInfo("Daniel", "1600 Pen Ave", "(613)-991-2563");
        BuddyInfo buddy2 = new BuddyInfo("Shoaib", "1700 Boat House", "(613)-131-3213");

        // Add the buddies in the address book
        AddressBook book = new AddressBook();
        book.addBuddy(buddy1);
        book.addBuddy(buddy2);

        // Connecting to the database through EntityManagerFactory
        // connection details loaded from persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");

        EntityManager em = emf.createEntityManager();

        // Creating a new transaction
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        // Persisting the buddy and the address book entity objects
        em.persist(book);
        em.persist(buddy1);
        em.persist(buddy2);

        tx.commit();

        // Querying the contents of the database using JPQL query
        Query query = em.createQuery("SELECT b FROM App.AddressBook b");

        @SuppressWarnings("unchecked")
        List<AddressBook> results = query.getResultList();

        System.out.println("\nList of App.AddressBook");
        System.out.println("-------------------");

        // Display a list of address books
        for (AddressBook addressBook : results) {
            System.out.println("->Address Book Number:" + addressBook.getId());

            // Display all buddies for each address book
            for (BuddyInfo buddy: addressBook.getBuddies()) {
                System.out.println("\nName: " + buddy.getName());
                System.out.println("Address: " + buddy.getAddress());
                System.out.println("Phone Number: " + buddy.getPhoneNumber());
            }
        }

        System.out.println("-------------------");

        // Closing connection
        em.close();
        emf.close();
    }
}
