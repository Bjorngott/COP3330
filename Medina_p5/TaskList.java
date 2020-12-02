package Medina_p5;

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

    public static void update(int index, String title, String description, String date) {
    }

    public static void createList() throws NoSuchElementException{
        Tasklist = new ArrayList<TaskItems>();
    }
    public static void loadList() throws IOException, NoSuchElementException {
    }


    public static void addentry(String name, String descrip, String date) {
        TaskItems tsk = new TaskItems(name, descrip, date);
        Tasklist.add(tsk);

        try{
            Tasklist.add(new TaskItems(name, descrip, date));
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
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

        if(removetsk < Tasklist.size()){
            Tasklist.remove(removetsk);
        }else{
            System.out.println("Invalid Index Number.\n");
        }
    }

    public static void editentry(){
        /*Scanner overwrite = new Scanner(System.in);
        System.out.println("Which task will you edit? Use 0-n: ");
        int index = overwrite.nextInt();
        overwrite.nextLine();

        if(index < Tasklist.size()){
            System.out.println("\nEnter a new task title: ");
            String title = overwrite.nextLine();
            System.out.println("\nEnter a new task description: ");
            String descrip = overwrite.nextLine();
            System.out.println("\nEnter a new due date (YYYY-MM-DD): ");
            String date = overwrite.nextLine();

            try{
                Tasklist.update(index, title, descrip, date);
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("Invalid index number.");
        }
         */

        Scanner overwrite = new Scanner(System.in);
        System.out.println("Which entry do you wish to edit? Use Index 0(being first entry) - n: ");
        int editing = overwrite.nextInt();
        Tasklist.remove(editing);
        Scanner tskinput = new Scanner(System.in);

        String Nam = "";
        String descr = "";
        String dae = "";

        System.out.println("What is the title of your task?\n");
        Nam = tskinput.nextLine();
        System.out.println("What is the description of your task?\n");
        descr = tskinput.nextLine();
        System.out.println("What is the due date of the task?\n");
        dae = tskinput.nextLine();
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
