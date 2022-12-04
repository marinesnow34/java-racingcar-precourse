package racingcar.view;

public enum Error {
    INVALID_NAME("[ERROR]이름은 5글자 이하 입니다.\n"),
    INVALID_INT("[ERROR]입력 값은 정수 입니다.\n");
    private String message;

    Error(String message) {
        this.message = message;
    }

    public void occur() {
        System.out.printf(message);
        throw new IllegalArgumentException();
    }
}
