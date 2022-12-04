package racingcar.view;

public class OutputView {
    private static final String MESSAGE_POSITION = "%s : %d\n";

    public void printPosition(String name, int position) {
        System.out.printf(MESSAGE_POSITION, name, position);
    }
}
