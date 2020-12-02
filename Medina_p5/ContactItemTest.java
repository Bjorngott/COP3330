package Medina_p5;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ContactItemTest {
    @Test
    public void creationFailsWithAllBlankValues(){
        ContactItem cont = new ContactItem("", "", "", "");
        //assertEquals(true, );
    }
    @Test
    public void creationSucceedsWithBlankEmail(){
        ContactItem cont = new ContactItem("Eddy", "Medina", "561-714-6797", "");
        //assertEquals(true, );
    }
    @Test
    public void creationSucceedsWithBlankFirstName(){
        ContactItem cont = new ContactItem("", "Medina", "561-714-6797", "eddym933@gmail.coim");
        //assertEquals(true, );
    }
    @Test
    public void creationSucceedsWithBlankLastName(){
        ContactItem cont = new ContactItem("Eddy", "", "561-714-6797", "eddym933@gmail.com");
        //assertEquals(true, );
    }
    @Test
    public void creationSucceedsWithBlankPhone(){
        ContactItem cont = new ContactItem("Eddy", "Medina", "", "eddym933@gmail.com");
        //assertEquals(true, );
    }
    @Test
    public void creationSucceedsWithNonBlankValues(){
        ContactItem cont = new ContactItem("Eddy", "Medina", "561-714-6797", "eddym933@gmail.com");
        //assertEquals(true, );
    }
    @Test
    public void editingFailsWithAllBlankValues(){
    }
    @Test
    public void editingSucceedsWithBlankEmail(){
    }
    @Test
    public void editingSucceedsWithBlankFirstName(){
    }
    @Test
    public void editingSucceedsWithBlankLastName(){
    }
    @Test
    public void editingSucceedsWithBlankPhone(){
    }
    @Test
    public void editingSucceedsWithNonBlankValues(){
    }
    @Test
    public void testToString(){
    }

}
