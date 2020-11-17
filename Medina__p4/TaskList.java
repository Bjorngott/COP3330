package Medina__p4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class TaskList extends TaskItems {
    public static List<TaskItems> Tasklist;

    TaskList(){
        super();
    }



    public static void createList() throws NoSuchElementException{
        Tasklist = new ArrayList<TaskItems>();
    }
    public static void loadList() throws IOException, NoSuchElementException {
    }


    public static void addentry(String name, String descrip, String date) {
        TaskItems tsk = new TaskItems(name, descrip, date);
        Tasklist.add(tsk);
    }

    public static void displayall() {
        for(TaskItems tsk : Tasklist) {
            System.out.println("Task ID: " + tsk.getTaskName() + "\nDescription: " + tsk.getDescription() + "\nDate: " + tsk.getDate());
        }
    }

    public static void entryremove() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which entry do you want removed? Use the index of 0(being first entry) - n: ");
        int removetsk = input.nextInt();
        Tasklist.remove(removetsk);
    }

    public static void editentry(){
        Scanner overwrite = new Scanner(System.in);
        System.out.println("Which entry do you wish to edit? Use Index 0(being first entry) - n: ");
        int editing = overwrite.nextInt();
        Tasklist.remove(editing);
        Scanner tskname = new Scanner(System.in);
        Scanner tskdescr = new Scanner(System.in);
        Scanner tskdate = new Scanner(System.in);

        String Nam = "";
        String descr = "";
        String dae = "";

        System.out.println("What is the title of your task?\n");
        Nam = tskname.nextLine();
        System.out.println("What is the description of your task?\n");
        descr = tskdescr.nextLine();
        System.out.println("What is the due date of the task?\n");
        dae = tskdate.nextLine();
        addentry(Nam, descr, dae);

    }

    public static void markcomplete(){
        Scanner complete = new Scanner(System.in);
        System.out.println("Which entry do you wish to mark as complete? Use Index 0(being first entry) - n: ");
        int editing = complete.nextInt();

        editentry();
    }

    public static void markincomplete(){
    }

    public static void savelist(){
    }
}
