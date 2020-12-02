package Medina_p5;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.List;

public class TaskItems {
    protected Integer TaskName;
    private String date;
    private String taskname;
    private String descrip;
    private boolean complete;
    private List<TaskItems> items;

    public TaskItems(String name, String descrip, String date) {
        this.date = date;
        this.taskname = name;
        this.descrip = descrip;
    }

    public TaskItems() {

    }
    public String getDueDate(int index){
        return this.date;
    }
    public String getDate() {
        return this.date;
    }

    public String getDescription() {
        return this.descrip;
    }
    public String getTitle(int index){
        return this.taskname;
    }
    public String getTaskName() {
        return this.taskname;
    }

    public boolean isNameValid(String taskname){
        return taskname.length()>0;
    }

    public static boolean isDateValid(String date){
        boolean valid = false;

        try{
            LocalDate.parse(date, DateTimeFormatter.ofPattern("uuuu-M-d").withResolverStyle(ResolverStyle.STRICT));
            valid = true;
        } catch(DateTimeParseException e){
            e.printStackTrace();
            valid = false;
        }
        return valid;
    }

    public void add(TaskItems item) {
        items.add(item);
    }
}
