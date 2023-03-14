import com.fifetoyi.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTests {

    @Test
    public void checkNumberReturnsFizzIfNumberIsDivisibleBy3() {
        assertEquals("Fizz", FizzBuzz.checkNumber(3));
    }

    @Test
    public void checkNumberReturnsBuzzIfNumberIsDivisibleBy5() {
        assertEquals("Buzz", FizzBuzz.checkNumber(5));
    }

    @Test
    public void checkNumberReturnsFizzBuzzIfNumberIsDivisibleBy3and5() {
        assertEquals("FizzBuzz", FizzBuzz.checkNumber(15));
    }

    @Test
    public void checkNumberReturnsSameNumberIfNoConditionsAreMet() {
        assertEquals("7", FizzBuzz.checkNumber(7));
    }
}
