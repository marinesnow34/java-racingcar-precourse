package racingcar.view;

import java.util.List;
import java.util.regex.Pattern;

public class Validator {
    private static final String NUMBER_REGAX = "^[0-9]+$";
    private static final int MAX_NAME_LENGTH = 5;

    public void validateName(List<String> names) {
        if (names.stream().anyMatch(this::validateNameLength)) {
            Error.INVALID_NAME.occur();
        }
    }

    public void validateInt(String input) {
        if (!isNumber(input)) {
            Error.INVALID_INT.occur();
        }
    }

    private boolean validateNameLength(String name) {
        return name.length() <= MAX_NAME_LENGTH;
    }


    private boolean isNumber(String input) {
        if (input.charAt(0) == '0') {
            return false;

        }
        return Pattern.matches(NUMBER_REGAX, input);
    }
}
