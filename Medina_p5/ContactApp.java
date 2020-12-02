package Medina_p5;

import java.io.IOException;
import java.util.Scanner;
import static Medina_p5.ContactList.*;

public class ContactApp {
    private static ContactList contactlist;
    public static String file = "savedlist.txt";
    private static boolean contin;
    public static int choice1, choice2;
    public static String first, last, phone, email;

    public static void Contact() throws IOException{
        contactlist = new ContactList();
        contactlist.createContact();
        Scanner input = new Scanner(System.in);

        System.out.println("**********************************************************\n");
        System.out.println("Please select one of the following.\n");
        System.out.println("1: Create a new contact list.\n");
        System.out.println("2: Load a contact list from file.\n");
        System.out.println("3: View the contact list.\n");
        System.out.println("4: Add contact to the list.\n");
        System.out.println("5: Edit contact on the list.\n");
        System.out.println("6: Remove contact from the list.\n");
        System.out.println("7: Save the current contact list.\n");
        System.out.println("8: Exit Program.\n");

        choice1 = input.nextInt();

        switch (choice1) {
            case 1:
                System.out.println("Creating Contact List\n");
                createContact();
                break;
            case 2:
                System.out.println("Loading Contact List\n");
                loadContact();
                break;
            case 3:
                System.out.println("Displaying all contacts.\n");
                displayallContact();
                break;
            case 4:
                System.out.println("Adding Contact to list.\n");
                Scanner first = new Scanner(System.in);
                Scanner last = new Scanner(System.in);
                Scanner phone = new Scanner(System.in);
                Scanner email = new Scanner(System.in);

                String frstname = "";
                String lastname = "";
                String phonenum = "";
                String emailadd = "";

                System.out.println("\nFirst name: ");
                frstname = first.nextLine();
                System.out.println("\nLast name: ");
                lastname = last.nextLine();
                System.out.println("\nPhone number: ");
                phonenum = phone.nextLine();
                System.out.println("\nEmail address: ");
                emailadd = email.nextLine();

                addContact(frstname, lastname, phonenum, emailadd);
                break;
            case 5:
                System.out.println("Edit a Contact.\n");
                editContact();
                break;
            case 6:
                System.out.println("Remove Contact.\n");
                removeContact();
                break;
            case 7:
                System.out.println("Save Contact List.\n");
                saveContacts();
                break;
            case 8:
                System.out.println("Exiting program");
                System.exit(0);
                break;
        }
        contin = true;
        while (contin == true) {
            System.out.println("**********************************************************\n");
            System.out.println("Please select one of the following.\n");
            System.out.println("1: Create a new contact list.\n");
            System.out.println("2: Load a contact list from file.\n");
            System.out.println("3: View the contact list.\n");
            System.out.println("4: Add contact to the list.\n");
            System.out.println("5: Edit contact on the list.\n");
            System.out.println("6: Remove contact from the list.\n");
            System.out.println("7: Save the current contact list.\n");
            System.out.println("8: Exit Program.\n");

            choice1 = input.nextInt();

            switch (choice1) {
                case 1:
                    System.out.println("Creating Contact List\n");
                    createContact();
                    break;
                case 2:
                    System.out.println("Loading Contact List\n");
                    loadContact();
                    break;
                case 3:
                    System.out.println("Displaying all contacts.\n");
                    displayallContact();
                    break;
                case 4:
                    System.out.println("Adding Contact to list.\n");
                    Scanner first = new Scanner(System.in);
                    Scanner last = new Scanner(System.in);
                    Scanner phone = new Scanner(System.in);
                    Scanner email = new Scanner(System.in);

                    String frstname = "";
                    String lastname = "";
                    String phonenum = "";
                    String emailadd = "";

                    System.out.println("\nFirst name: ");
                    frstname = first.nextLine();
                    System.out.println("\nLast name: ");
                    lastname = last.nextLine();
                    System.out.println("\nPhone number: ");
                    phonenum = phone.nextLine();
                    System.out.println("\nEmail address: ");
                    emailadd = email.nextLine();

                    addContact(frstname, lastname, phonenum, emailadd);
                    break;
                case 5:
                    System.out.println("Edit a Contact.\n");
                    editContact();
                    break;
                case 6:
                    System.out.println("Remove Contact.\n");
                    removeContact();
                    break;
                case 7:
                    System.out.println("Save Contact List.\n");
                    saveContacts();
                    break;
                case 8:
                    System.out.println("Exiting program");
                    System.exit(0);
                    break;
            }
            System.out.println("Do you wish to continue?\n 1: Yes\n 2: No\n");
            choice2 = input.nextInt();
            if (choice2 == 1) {
                contin = true;
            } else {
                contin = false;
            }
        }
    }
}

