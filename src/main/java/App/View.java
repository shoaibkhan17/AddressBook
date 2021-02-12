//package App;
//
//import javax.swing.*;
//import java.awt.event.ActionListener;
//
///**
// * App.View Class
// * @author Shoaib Khan
// * @studentID 101033582
// * @date 29/01/2020
// */
//public class View extends JFrame {
//    private JList<BuddyInfo> addressList;
//    private AddressBook addressBook;
//
//    private JMenuItem addContact = new JMenuItem("Add Contact");
//    private JMenuItem removeContact = new JMenuItem("Remove Contact");
//
//    public View(AddressBook addressBook) {
//        this.setAddressBook(addressBook);
//    }
//
//    public void setAddressBook(AddressBook addressBook) {
//        this.addressBook = addressBook;
//    }
//
//    public void init() {
//        this.initFrame();
//        this.initMenu();
//        this.initList();
//        this.run();
//    }
//
//    public void initFrame() {
//        this.setTitle("Address Book");
//        this.setSize(400, 200);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//
//    public void initMenu() {
//        JMenuBar menuBar = new JMenuBar();
//        JMenu menu = new JMenu("Options");
//
//        JMenuItem exit = new JMenuItem("Exit");
//        exit.addActionListener((event) -> System.exit(0));
//        menu.add(addContact);
//        menu.add(removeContact);
//        menu.add(exit);
//        menuBar.add(menu);
//        this.setJMenuBar(menuBar);
//    }
//
//    public BuddyInfo getSelectedValue() {
//        return addressList.getSelectedValue();
//    }
//
//    public String[] addControlPopup() {
//        JFrame popupFrame = new JFrame();
//        String[] params = new String[3];
//        params[0] = JOptionPane.showInputDialog(popupFrame, "Enter Name").toString();
//        params[1] = JOptionPane.showInputDialog(popupFrame, "Enter Address").toString();
//        params[2] = JOptionPane.showInputDialog(popupFrame, "Enter Phone Number").toString();
//        return params;
//    }
//
//    public void addContactActionListener(ActionListener listener) {
//        addContact.addActionListener(listener);
//    }
//
//    public void removeContactActionListener(ActionListener listener) {
//        removeContact.addActionListener(listener);
//    }
//
//    public void initList() {
//        addressList = new JList<BuddyInfo>(addressBook);
//        this.add(new JScrollPane(addressList));
//    }
//
//    public void run() {
//        this.setVisible(true);
//    }
//}
