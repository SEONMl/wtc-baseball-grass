package baseball.service;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RandomGenerator {
    public String generateRandomNumbers(int answerLength) {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < answerLength) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }

        List<String> stringNumberList = computer.stream().map(String::valueOf).collect(Collectors.toList());
        String generated = String.join("", stringNumberList);
        return generated;
    }
}
