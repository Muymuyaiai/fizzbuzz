import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzbuzzTest {
    @Test
    void fizzOrBuzzTest() {
        //given
        int i1 = 15;
        int i2 = 9;
        int i3 = 100;
        int i4 = 17;
        //when
        String actual1 = Fizzbuzz.fizzbuzz(i1);
        String actual2 = Fizzbuzz.fizzbuzz(i2);
        String actual3 = Fizzbuzz.fizzbuzz(i3);
        String actual4 = Fizzbuzz.fizzbuzz(i4);
        //then
        assertEquals("fizzbuzz", actual1);
        assertEquals("fizz", actual2);
        assertEquals("buzz", actual3);
        assertEquals("17", actual4);
    }

}
