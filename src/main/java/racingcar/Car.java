package racingcar;

public class Car {
    private static final int MOVE_CONDITION = 4;
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void go(int number) {
        if (MOVE_CONDITION <= number) {
            position += 1;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
