package Medina__p4;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class TaskListTest {
    @Test
    public void addingTaskItemsIncreasesSize(){

    }
    @Test
    public void completingTaskItemChangesStatus(){

    }
    @Test
    public void completingTaskItemFailsWithInvalidIndex(){

    }
    @Test
    public void editingTaskItemChangesValues(){

    }
    @Test
    public void editingTaskItemDescriptionChangesValue(){

    }
    @Test
    public void editingTaskItemDescriptionFailsWithInvalidIndex(){

    }
    @Test
    public void editingTaskItemDueDateChangesValue(){

    }
    @Test
    public void editingTaskItemDueDateFailsWithInvalidIndex(){

    }
    @Test
    public void editingTaskItemTitleChangesValue(){

    }
    @Test
    public void editingTaskItemTitleFailsWithInvalidIndex(){
    }
    @Test
    public void gettingTaskItemDescriptionFailsWithInvalidIndex(){
    }
    @Test
    public void gettingTaskItemDescriptionSucceedsWithValidIndex(){
        TaskItems tsk = new TaskItems("Task testing", "Testing", "1999-28-2");
        assertEquals("Testing", tsk.getDescription());
    }
    @Test
    public void gettingTaskItemDueDateFailsWithInvalidIndex(){
    }
    @Test
    public void gettingTaskItemDueDateSucceedsWithValidIndex(){
    }
    @Test
    public void gettingTaskItemTitleFailsWithInvalidIndex(){
    }
    @Test
    public void gettingTaskItemTitleSucceedsWithValidIndex(){
    }
    @Test
    public void newTaskListIsEmpty(){
        //Tasklist tsk = new Tasklist();
        //assertEquals(TaskItems("", "", "", tsk.TaskItems);
    }
    @Test
    public void removingTaskItemsDecreasesSize(){
    }
    @Test
    public void removingTaskItemsFailsWithInvalidIndex(){
    }
    @Test
    public void savedTaskListCanBeLoaded(){
    }
    @Test
    public void uncompletingTaskItemChangesStatus(){
    }
    @Test
    public void uncompletingTaskItemFailsWithInvalidIndex(){
    }

}
