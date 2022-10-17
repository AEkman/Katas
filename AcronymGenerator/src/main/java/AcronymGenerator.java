import java.util.Arrays;
import java.util.stream.Collectors;

public class AcronymGenerator {
    private static String getFirstLetterOfWord(String word) {
        if (word.equals("von")) {
            return "v";
        } else {
            return String.valueOf(word.charAt(0))
                         .toUpperCase();
        }
    }

    private static String[] splitWordBySpaceOrDash(String input) {
        return input.replace("-", " ")
                    .split(" ");
    }

    public String generate(String input) {
        if (input.isEmpty()) {
            return "";
        }

        String[] words = splitWordBySpaceOrDash(input);

        return Arrays.stream(words)
                     .map(AcronymGenerator::getFirstLetterOfWord)
                     .collect(Collectors.joining());

    }

}
