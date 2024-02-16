import org.junit.Test;

import java.time.DateTimeException;
import java.time.OffsetDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class MainTest {
    @Test
    public void testData(){
        String dataString = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = Main.getParse(dataString);
        OffsetDateTime exasperation = OffsetDateTime.parse(dataString);
        assertEquals (exasperation,dateTime);
    }
    @Test
    public void testInvalidate(){
        String invalidate = "Charmander";
        assertThrows(DateTimeException.class,()-> Main.getParse(invalidate));
    }
}