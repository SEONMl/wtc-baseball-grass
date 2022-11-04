package baseball.configuration;

import java.util.HashSet;
import java.util.Set;

import static baseball.entity.NumberBaseball.GAME_ANSWER_MAX_VALUE;

public class InputConfigure {

    public static void verifyInput(String input) {
        Set<Character> wordSet = new HashSet<>();

        checkLength(input);
        for(int i=0 ; i<input.length() ; i++) {
            char c = input.charAt(i);
            wordSet.add(c);
            checkWord(c);
        }
        checkDifferenceEachOther(wordSet);
    }

    private static void checkLength(String input) {
        if (input.length() != GAME_ANSWER_MAX_VALUE)
            throw new IllegalArgumentException();
    }

    private static void checkDifferenceEachOther(Set<Character> wordSet) {
        if (wordSet.size() != GAME_ANSWER_MAX_VALUE)
            throw new IllegalArgumentException();
    }

    private static void checkWord(char c) {
        if ('1'>c || c>'9')
            throw new IllegalArgumentException();
    }
}
