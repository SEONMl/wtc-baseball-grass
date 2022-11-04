package baseball.view;

import baseball.configuration.InputConfigure;
import camp.nextstep.edu.missionutils.Console;

import java.util.Map;

import static baseball.entity.NumberBaseball.GAME_ANSWER_MAX_VALUE;
import static baseball.view.Display.printReGameMessage;

public class Controller {

    private Display display = new Display();

    public void printGameStartMessage() {
        display.printInitMessage();
    }

    public String printAndInputNumber() {
        display.printInputNumberMessage();
        String input = Console.readLine();
        InputConfigure.verifyInput(input);
        return input;
    }

    public boolean printRoundResult(Map<String, Integer> resultMap) {
        int ball = resultMap.get("ball");
        int strike = resultMap.get("strike");
        boolean flag = false;

        if (strike == GAME_ANSWER_MAX_VALUE) {
            flag = true;
        }
        if (ball == 0 && strike == 0) {
            display.printNothingMessage();
            display.printNewLine();
            return false;
        }
        if (ball > 0) {
            display.printBallMessage(ball);
        }
        if (strike > 0) {
            display.printStrikeMessage(strike);
        }
        display.printNewLine();
        return flag;
    }

    public boolean printReGameAndInput() {
        printReGameMessage();

        String input = Console.readLine();
        InputConfigure.verifyReGameInput(input);

        if (input.equals("1")) {
            return true;
        }
        return false;
    }
}
