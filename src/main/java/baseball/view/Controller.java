package baseball.view;

import baseball.configuration.InputConfigure;
import camp.nextstep.edu.missionutils.Console;

import java.util.Map;

import static baseball.view.Display.*;

public class Controller {
    public void printRoundStart() {
        printInitMessage();
    }

    public String printAndInputNumber() {
        printInputNumberMessage();
        String input = Console.readLine();
        InputConfigure.verifyInput(input);
        return input;
    }

    public boolean printRoundResult(Map<String,Integer> resultMap) {
        int ball = resultMap.get("ball");
        int strike = resultMap.get("strike");
        boolean flag = false;

        if (strike == GAME_ANSWER_MAX_VALUE) {
            flag = true;
        }
        if(ball==0 && strike==0) {
            printNothingMessage();
            return false;
        }
        if(ball>0) {
            printBallMessage(ball);
        }
        if(strike>0){
            printStrikeMessage(strike);
        }
        System.out.println("");
        return flag;
    }
}
