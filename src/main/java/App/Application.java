package App;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Application Class
 * @author Shoaib Khan
 * @studentID 101033582
 * @date 04/02/2020
 */
@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner demo(AddressBookRepo repository) {
        return (args) -> {
            // save a few customers
            AddressBook book1 = new AddressBook();
            BuddyInfo buddy1 = new BuddyInfo("Shoaib", "123 water road", "6138896587");
            BuddyInfo buddy2 = new BuddyInfo("Omar", "153 water road", "6135896547");

            AddressBook book2 = new AddressBook();
            BuddyInfo buddy3 = new BuddyInfo("Cathy", "172 water road", "61374726553");
            BuddyInfo buddy4 = new BuddyInfo("Natalie", "112 water road", "6134651352");

            book1.addBuddy(buddy1);
            book1.addBuddy(buddy2);
            book1.setName("book1");

            book2.addBuddy(buddy3);
            book2.addBuddy(buddy4);
            book2.setName("book2");

            repository.save(book1);
            repository.save(book2);

//            // fetch all address books
//            log.info("AddressBook found using the findAll():");
//            log.info("-------------------------------");
//            for (AddressBook book : repository.findAll()) {
//                log.info("Address book id: " + book.getId());
//                log.info("Address book name: " + book.getName());
//                log.info("Address book size: " + book.size());
//                log.info("--Address book contents--");
//
//                for (BuddyInfo buddy: book.getBuddies()) {
//                    log.info(buddy.toString());
//                }
//                log.info("\n");
//            }
//
//            // fetch an individual address book by ID
//            AddressBook bookById = repository.findById(1L);
//            log.info("Address book found with findById(1L):");
//            log.info("--------------------------------");
//
//            log.info("Address book id: " + bookById.getId());
//            log.info("Address book name: " + bookById.getName());
//            log.info("Address book size: " + bookById.size());
//            log.info("--Address book contents--");
//
//            for (BuddyInfo buddy: bookById.getBuddies()) {
//                log.info(buddy.toString());
//            }
//            log.info("\n");
//
//            // fetch address books by name
//            log.info("AddressBook found using the findByName('book2'):");
//            log.info("-------------------------------");
//            for (AddressBook book : repository.findByName("book2")) {
//                log.info("Address book id: " + book.getId());
//                log.info("Address book name: " + book.getName());
//                log.info("Address book size: " + book.size());
//                log.info("--Address book contents--");
//
//                for (BuddyInfo buddy: book.getBuddies()) {
//                    log.info(buddy.toString());
//                }
//                log.info("\n");
//            }
//
//            log.info("");
        };
    }
}
