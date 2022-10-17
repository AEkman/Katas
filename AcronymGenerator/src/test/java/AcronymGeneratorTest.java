import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AcronymGeneratorTest {

    private static final AcronymGenerator acronymGenerator = new AcronymGenerator();

    @ParameterizedTest
    @CsvSource({
            "'',''",
            "Thomas Meyer, TM",
            "martin schmidt, MS",
            "Jan Erich Mueller, JEM",
            "Jan-Erich Schmidt, JES",
            "Paul Meyer-Schmidt, PMS",
            "Paul von Lahnstein, PvL",
            "Martin von Lahnstein-Meyer, MvLM"
    })
    void testSomething(String input, String expected) {
        var result = acronymGenerator.generate(input);

        assertThat(result).isEqualTo(expected);
    }
}
