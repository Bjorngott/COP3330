package Medina_p5;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class TaskListTest {
    @Test
    public void newListIsEmpty(){
        TaskList testing = new TaskList();
        //assertEquals(0, testing.size());
    }
    @Test
    public void addingTaskItemsIncreasesSize(){
        TaskItems testing = new TaskItems("Task 1", "First Task", "2020-11-30");
        TaskList list = new TaskList();
        list.add(testing);

        //assertEquals(1, testing.size());
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
        TaskList list = new TaskList();
        assertThrows(IndexOutOfBoundsException.class, ()-> list.getDueDate(0));
    }
    @Test
    public void gettingTaskItemDueDateSucceedsWithValidIndex(){
        TaskList list = new TaskList();
        assertThrows(IndexOutOfBoundsException.class, ()-> list.getDueDate(1));
    }
    @Test
    public void gettingTaskItemTitleFailsWithInvalidIndex(){
        TaskList list = new TaskList();
        assertThrows(IndexOutOfBoundsException.class, ()-> list.getTitle(0));
    }
    @Test
    public void gettingTaskItemTitleSucceedsWithValidIndex(){
        TaskList list = new TaskList();
        assertThrows(IndexOutOfBoundsException.class, ()-> list.getTitle(1));
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
