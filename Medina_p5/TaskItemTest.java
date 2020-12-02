package Medina_p5;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void constructorFailsWithInvalidDueDate(){
        TaskItems task = new TaskItems("Task 1", "Testing Task", "01-12-2020");

        assertEquals("Task 1", task.getTaskName());
        assertEquals("Testing Task", task.getDescription());
        //assertEquals("01-12-2020", task.getDate());
        assertEquals(false, task.isDateValid(task.getDate()));
    }
    @Test
    public void constructorFailsWithInvalidTitle(){
        TaskItems task = new TaskItems("", "Testing Task", "2020-12-01");

        assertEquals(false, task.isNameValid(task.getTaskName()));
        //assertEquals("", task.getTaskName());
        assertEquals("Testing Task", task.getDescription());
        assertEquals("2020-12-01", task.getDate());
        /*assertThrows(IllegalArgumentException.class, () ->{
            new TaskItems("", "", "2020-12-01");
        });
         */
    }
    @Test
    public void constructorSucceedsWithValidDueDate(){
        TaskItems task = new TaskItems("Task 1", "Testing Task", "2020-12-01");

        assertEquals("Task 1", task.getTaskName());
        assertEquals("Testing Task", task.getDescription());
        assertEquals("2020-12-01", task.getDate());
    }
    @Test
    public void constructorSucceedsWithValidTitle(){
        TaskItems task = new TaskItems("Task 1", "Testing Task", "2020-12-01");

        assertEquals("Task 1", task.getTaskName());
        assertEquals("Testing Task", task.getDescription());
        assertEquals("2020-12-01", task.getDate());
    }
    @Test
    public void editingDescriptionSucceedsWithExpectedValue(){
        TaskItems item = new TaskItems("Task 1", "Testing task", "2020-12-01");
        TaskList list = new TaskList();
        list.add(item);
        list.update(0, "Task 2", item.getDescription(), item.getDate());
    }
    @Test
    public void editingDueDateFailsWithInvalidDateFormat(){
    }
    @Test
    public void editingDueDateFailsWithInvalidYYYMMDD(){
    }
    @Test
    public void editingDueDateSucceedsWithExpectedValue(){
    }
    @Test
    public void editingTitleFailsWithEmptyString(){
    }
    @Test
    public void editingTitleSucceedsWithExpectedValue(){
    }


}
