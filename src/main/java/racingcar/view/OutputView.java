package racingcar.view;

import java.util.List;

public class OutputView {
    private static final String MESSAGE_POSITION = "%s : %d\n";
    private static final String MESSAGE_WINNERS = "최종 우승자 : %s\n";

    public void printPosition(String name, int position) {
        System.out.printf(MESSAGE_POSITION, name, position);
    }

    public void printWinners(List<String> winners) {
        System.out.printf(MESSAGE_WINNERS, String.join(", ", winners));
    }
}
