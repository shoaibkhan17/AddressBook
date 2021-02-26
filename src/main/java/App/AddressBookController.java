package App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * AddressBookController Class
 * @author Shoaib Khan
 * @studentID 101033582
 * @date 04/02/2020
 */
@Controller
public class AddressBookController {

    @Autowired
    private AddressBookRepo repo;

    @GetMapping("/")
    public String getAddressBookContents(Model model) {
        List<AddressBook> books = repo.findAll();
        model.addAttribute("books", books);

        AddressBook book1 = repo.findByName("book1").get(0);
        model.addAttribute("book1Buddies", book1.getBuddies());

        AddressBook book2 = repo.findByName("book2").get(0);
        model.addAttribute("book2Buddies",book2.getBuddies());

        return "AddressBook";
    }

    @PostMapping("/addBuddyToAddressBook1")
    public String addBuddyToAddressBook1(@ModelAttribute BuddyInfo bud, Model model) {
        List<AddressBook> books = repo.findAll();
        model.addAttribute("books", books);

        AddressBook book1 = repo.findByName("book1").get(0);
        model.addAttribute("book1Buddies", book1.getBuddies());

        BuddyInfo buddy = new BuddyInfo(bud.getName(), bud.getAddress(), bud.getPhoneNumber());
        book1.addBuddy(buddy);

        AddressBook book2 = repo.findByName("book2").get(0);
        model.addAttribute("book2Buddies",book2.getBuddies());

        return "AddressBook";
    }

    @PostMapping("/addBuddyToAddressBook2")
    public String addBuddyToAddressBook2(@ModelAttribute BuddyInfo bud, Model model) {
        List<AddressBook> books = repo.findAll();
        model.addAttribute("books", books);

        AddressBook book1 = repo.findByName("book1").get(0);
        model.addAttribute("book1Buddies", book1.getBuddies());

        AddressBook book2 = repo.findByName("book2").get(0);
        model.addAttribute("book2Buddies",book2.getBuddies());

        BuddyInfo buddy = new BuddyInfo(bud.getName(), bud.getAddress(), bud.getPhoneNumber());
        book2.addBuddy(buddy);

        return "AddressBook";
    }

    @GetMapping("/addToBook1")
    public String addToBook1(Model model) {
        model.addAttribute("buddy", new BuddyInfo());
        return "addToBook1";
    }

    @GetMapping("/addToBook2")
    public String addToBook2(Model model) {
        model.addAttribute("buddy", new BuddyInfo());
        return "addToBook2";
    }
}