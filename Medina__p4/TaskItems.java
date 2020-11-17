package Medina__p4;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class TaskItems {
    protected Integer TaskName;
    private String date;
    private String taskname;
    private String descrip;
    private boolean complete;

    public TaskItems(String name, String descrip, String date) {
        this.date = date;
        this.taskname = name;
        this.descrip = descrip;


    }

    public TaskItems() {

    }

    public String getDate() {
        return this.date;
    }

    public String getDescription() {
        return this.descrip;
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

}
