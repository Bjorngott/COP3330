package Medina_p5;
import java.io.*;
import java.util.*;
import static Medina_p5.TaskList.*;

public class TaskApp extends Object{
    private static TaskList tasklist;
    public static String file = "savedlist.txt";
    private static boolean contin;
    public static int choice1, choice2;
    public static String TaskName, Descrip, Date;

    public static void Task() throws IOException {
        tasklist = new TaskList();
        tasklist.createList();
        Scanner input = new Scanner(System.in);

        System.out.println("**********************************************************\n");
        System.out.println("Please select one of the following.\n");
        System.out.println("1: Create a new list.\n");
        System.out.println("2: Load a list from file.\n");
        System.out.println("3: View the list.\n");
        System.out.println("4: Add item to the list.\n");
        System.out.println("5: Edit item on the list.\n");
        System.out.println("6: Remove item from the list.\n");
        System.out.println("7: Mark item as complete.\n");
        System.out.println("8: Mark item as incomplete.\n");
        System.out.println("9: Save the current list.\n");
        System.out.println("10: Exit Program.\n");

        choice1 = input.nextInt();

        switch (choice1) {
            case 1:
                System.out.println("Creating list.\n");
                createList();
                break;
            case 2:
                System.out.println("Loading list from file.\n");
                loadList();
                break;
            case 3:
                System.out.println("Printing List.\n");
                displayall();
                break;
            case 4:
                System.out.println("Adding entry to list.\n");
                Scanner input2 = new Scanner(System.in);

                String name = "";
                String descrip = "";
                String date = "";

                System.out.println("What is the title of your task?\n");
                name = input2.nextLine();
                System.out.println("What is the description of your task?\n");
                descrip = input2.nextLine();
                System.out.println("What is the due date of the task?\n");
                date = input2.nextLine();

                addentry(name, descrip, date);
                break;
            case 5:
                System.out.println("Edit item on the list.\n");
                editentry();
                break;
            case 6:
                System.out.println("Removing item from list.\n");
                entryremove();
                break;
            case 7:
                System.out.println("Mark item as complete.\n");
                markcomplete();
                break;
            case 8:
                System.out.println("Mark as incomplete.\n");
                markincomplete();
                break;
            case 9:
                System.out.println("Saving list to file.\n");
                savelist();
                break;
            case 10:
                System.exit(0);
                break;
        }
        contin = true;
        while (contin == true) {
            System.out.println("**********************************************************\n");
            System.out.println("Please select one of the following.\n");
            System.out.println("1: Create a new list.\n");
            System.out.println("2: Load a list from file.\n");
            System.out.println("3: View the list.\n");
            System.out.println("4: Add item to the list.\n");
            System.out.println("5: Edit item to the list.\n");
            System.out.println("6: Remove item from the list.\n");
            System.out.println("7: Mark item as complete.\n");
            System.out.println("8: Mark item as incomplete.\n");
            System.out.println("9: Save the current list.\n");
            System.out.println("10: Exit Program.\n");

            choice1 = input.nextInt();

            switch (choice1) {
                case 1:
                    System.out.println("Creating list.\n");
                    createList();
                    break;
                case 2:
                    System.out.println("Loading list from file.\n");
                    loadList();
                    break;
                case 3:
                    System.out.println("Printing List.\n");
                    displayall();
                    break;
                case 4:
                    System.out.println("Adding entry to list.\n");
                    Scanner input2 = new Scanner(System.in);

                    String name = "";
                    String descrip = "";
                    String date = "";

                    System.out.println("What is the title of your task?\n");
                    name = input2.nextLine();
                    System.out.println("What is the description of your task?\n");
                    descrip = input2.nextLine();
                    System.out.println("What is the due date of the task?\n");
                    date = input2.nextLine();

                    addentry(name, descrip, date);
                    break;
                case 5:
                    System.out.println("Edit item on the list.\n");
                    editentry();
                    break;
                case 6:
                    System.out.println("Removing item from list.\n");
                    String Task = "23";
                    entryremove();
                    break;
                case 7:
                    System.out.println("Mark item as complete.\n");
                    markcomplete();
                    break;
                case 8:
                    System.out.println("Mark as incomplete.\n");
                    markincomplete();
                    break;
                case 9:
                    System.out.println("Saving list to file.\n");
                    savelist();
                    break;
                case 10:
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
