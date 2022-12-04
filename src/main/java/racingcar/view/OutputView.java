package racingcar.view;

import java.util.Collections;
import java.util.List;

public class OutputView {
    private static final String MESSAGE_POSITION = "%s : %s\n";
    private static final String MESSAGE_WINNERS = "최종 우승자 : %s\n";
    private static final String FORMAT_POSITION = "-";

    public void printPosition(String name, int position) {
        String positionFormat = String.join("", Collections.nCopies(position, FORMAT_POSITION));
        System.out.printf(MESSAGE_POSITION, name, positionFormat);
    }

    public void printWinners(List<String> winners) {
        System.out.printf(MESSAGE_WINNERS, String.join(", ", winners));
    }
}
