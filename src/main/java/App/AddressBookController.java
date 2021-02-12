package App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
    public String getAddressBookContents(Model model)
    {
        List<AddressBook> books = repo.findAll();
        model.addAttribute("books", books);

        AddressBook book = repo.findByName("book1").get(0);
        model.addAttribute("buddies",book.getBuddies());
        return "AddressBook";
    }
}