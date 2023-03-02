import com.fifetoyi.StringSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringSumTests {

    @Test
    void givenTwoIntegers_returnSum(){
        // Given
        String a = "0";
        String b = "2";

        // Then
        assertEquals(2, StringSum.sum(a, b));
    }
}
