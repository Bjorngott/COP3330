package Medina_p5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ContactList extends ContactItem{
    public static List<ContactItem> contactlist;

    public ContactList() {
        super();
    }


    public static void createContact() throws NoSuchElementException{
        contactlist = new ArrayList<ContactItem>();
    }
    public static void loadContact() throws IOException, NoSuchElementException {
    }


    public static void addContact(String frstname, String lastname, String phonenum, String emailadd) {
        ContactItem cont = new ContactItem(frstname, lastname, phonenum, emailadd);
        contactlist.add(cont);
    }


    public static void displayallContact() {
        for(ContactItem cont : contactlist) {
            System.out.println("First name: " +cont.getFirstName() + "\nLast Name: " + cont.getLastName() + "\nPhone Number: " + cont.getPhoneNum() + "\nEmail Address: " + cont.getEmailAdd());
            System.out.println("\n");
        }
    }

    public static void removeContact() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which Contact do you want to remove? Use index 0 - n.\n");
        int removecont = input.nextInt();

        if(removecont < contactlist.size()){
            contactlist.remove(removecont);
        }else{
            System.out.println("Invalid Index Number.\n");
        }
    }

    public static void editContact(){
        Scanner overwrite = new Scanner(System.in);
        System.out.println("Which Contact do you wish to edit? use index 0 - n.\n");
        int edit = overwrite.nextInt();
        contactlist.remove(edit);
        Scanner input = new Scanner(System.in);


        String frstname = "";
        String lastname = "";
        String phonenum = "";
        String emailadd = "";

        System.out.println("\nFirst name: ");
        frstname = input.nextLine();
        System.out.println("\nLast name: ");
        lastname = input.nextLine();
        System.out.println("\nPhone number: ");
        phonenum = input.nextLine();
        System.out.println("\nEmail address: ");
        emailadd = input.nextLine();
        if(frstname.length()>0 && lastname.length()>0 && phonenum.length()>0 && emailadd.length()>0){
            System.out.println("");
        }
        addContact(frstname, lastname, phonenum, emailadd);
    }

    public static void saveContacts(){
    }
}
