import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckAsserts {
    final private  boolean test = true;

    @Test
    void testAssertEquals(){
        assertEquals(test,true);
    }
    @Test
    void testAssertTrue(){
        assertTrue(test);
    }
    @Test
    void testAssertFalse(){
        assertFalse(!test);
    }
    @Test
    void testAssertNotEquals(){
        assertNotEquals(test,false);
    }

}
