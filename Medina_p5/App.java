package Medina_p5;
import java.util.*;
import java.io.*;
import static Medina_p5.ContactApp.Contact;
import static Medina_p5.TaskApp.Task;

public class App{


    public static void main(String args[]) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Select one.\n");
        System.out.println("1. Task List\n");
        System.out.println("2. Contact List\n");
        System.out.println("3. Exit Program.\n");
        int choice = input.nextInt();

        if(choice == 1){
            Task();
        }
        else if (choice == 2){
            Contact();
        }
        else if(choice == 3){
            System.exit(0);
        }
        else{
            System.out.println("Invalid input. Exiting Program.");
        }
    }
}
