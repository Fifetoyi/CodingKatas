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

    @Test
    void givenOneEmptyString_returnsZero() {
        // Given
        String a = "";
        String b = "2";

        // Then
        assertEquals(0, StringSum.sum(a, b));
    }

    @Test
    void givenTwoEmptyStrings_returnsZero() {
        // Given
        String a = "";
        String b = "";

        // Then
        assertEquals(0, StringSum.sum(a, b));
    }

    @Test
    void givenInvalidNumberInEitherField_returnZero() {
        // Given
        String a = "a";
        String b = "b";

        // Then
        assertEquals(0, StringSum.sum(a, b));
    }
}
