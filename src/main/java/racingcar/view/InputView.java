package racingcar.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

import java.util.Arrays;
import java.util.List;

public class InputView {
    private static final String MESSAGE_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String MESSAGE_COUNT = "시도할 회수는 몇회인가요?";


    public List<String> inputNames() {
        System.out.println(MESSAGE_NAME);
        return Arrays.asList(readLine().split(","));
    }

    public int inputCount() {
        System.out.println(MESSAGE_COUNT);
        return Integer.parseInt(readLine());
    }
}
