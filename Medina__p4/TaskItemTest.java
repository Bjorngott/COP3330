package Medina__p4;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class TaskItemTest {
    @Test
    public void creatingTaskItemFailsWithInvalidDueDate(){
        TaskItems tsk = new TaskItems("Task testing ", "Testing ", "2-28-1999");
        assertEquals(false, tsk.isDateValid(tsk.getDate()));
    }
    @Test
    public void creatingTaskItemFailsWithInvalidTitle(){
        TaskItems tsk = new TaskItems("", "Testing ", "1999-2-28");
        assertEquals(false, tsk.isNameValid(tsk.getTaskName()));
    }
    @Test
    public void creatingTaskItemSucceedsWithValidDueDate(){
        TaskItems tsk = new TaskItems("Task testing", "Testing", "1999-2-28");
        assertEquals(true, tsk.isDateValid(tsk.getDate()));
    }
    @Test
    public void creatingTaskItemSucceedsWithValidTitle(){
        TaskItems tsk = new TaskItems("Task Testing", "Testing ", "1999-2-28");
        assertEquals(true, tsk.isNameValid(tsk.getTaskName()));
    }
    @Test
    public void settingTaskItemDueDateFailsWithInvalidDate(){
        assertDoesNotThrow(() -> new TaskItems("Task testing ", "Testing ", "2-28-1999"));
    }
    @Test
    public void settingTaskItemDueDateSucceedsWithValidDate(){
        assertDoesNotThrow(() -> new TaskItems("Task testing ", "Testing ", "1999-2-28"));
    }
    @Test
    public void settingTaskItemTitleFailsWithInvalidTitle(){
        assertDoesNotThrow(() -> new TaskItems("", "Testing", "1999-2-28"));
    }
    @Test
    public void settingTaskItemTitleSucceedsWithValidTitle(){
        assertDoesNotThrow(() -> new TaskItems("Task testing", "Testing", "1999-2-28"));
    }


    /*
    Gonna be honest, was unsure which format was right. Saw Prof. H do the above in some example coding, but just in case
    im gonna do these below as im completely unsure if this is how its done.
     */

    @Test
    public void settingTaskItemDueDateFailsWithInvalidDate2(){
        TaskItems tsk = new TaskItems("Task testing ", "Testing ", "2-28-1999");
        assertEquals(false, tsk.isDateValid(tsk.getDate()));
    }
    @Test
    public void settingTaskItemDueDateSucceedsWithValidDate2(){
        TaskItems tsk = new TaskItems("Testing", "Testing ", "1999-2-28");
        assertEquals(true, tsk.isDateValid(tsk.getDate()));
    }
    @Test
    public void settingTaskItemTitleFailsWithInvalidTitle2(){
        TaskItems tsk = new TaskItems("", "Testing ", "1999-2-28");
        assertEquals(false, tsk.isNameValid(tsk.getTaskName()));
    }
    @Test
    public void settingTaskItemTitleSucceedsWithValidTitle2(){
        TaskItems tsk = new TaskItems("Task testing ", "Testing ", "2-28-1999");
        assertEquals(true, tsk.isNameValid(tsk.getTaskName()));
    }



}
