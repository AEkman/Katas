import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.fail;

public class AcronymGeneratorTest {

    @ParameterizedTest
    @CsvSource()
    void testSomething(String input, String expected) {
        fail("Start here!");
    }
}
