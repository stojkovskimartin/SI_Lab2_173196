import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SILab2Test {

    private final SILab2 lab2 = new SILab2();

    @Test
    public void everyBranch(){
        ArrayList<String> list = new ArrayList<>();
        SILab2.User user = null;
        assertFalse(lab2.function(user, list));
        user = new SILab2.User("test@test.com","" ,"");
        assertFalse(lab2.function(user, list));
        user = new SILab2.User("test@test.com","test1" ,"test");
        assertFalse(lab2.function(user, list));
        user = new SILab2.User("test@test.com","test1" ,"Zadacabroj1");
        assertFalse(lab2.function(user, list));
        user = new SILab2.User("test@test.com","test1" ,"Zadacabroj1*");
        assertTrue(lab2.function(user, list));
    }

    @Test
    public void everyStatement(){
        ArrayList<String> list = new ArrayList<>();
        SILab2.User user = null;
        assertFalse(lab2.function(user, list));
        user = new SILab2.User("test@test.com","test1" ,"Zadacabroj1*");
        assertTrue(lab2.function(user, list));
    }
}
