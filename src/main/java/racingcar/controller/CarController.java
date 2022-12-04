package racingcar.controller;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.Car;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class CarController {
    private final static int MIN_RANDOM = 0;
    private final static int MAX_RANDOM = 9;
    private final InputView inputView;
    private final OutputView outputView;
    private List<Car> cars;
    private int count;

    public CarController(OutputView outputView) {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void start() {
        inputUser();
        inputCount();
        for (int i = 0; i < count; i++) {
            moveCars();
            printMap();
        }
    }

    private void inputUser() {
        List<String> users = inputView.inputNames();
        cars = users.stream().map(Car::new).collect(Collectors.toList());
    }

    private void inputCount() {
        count = inputView.inputCount();
    }

    private void moveCars() {
        cars.forEach(car -> car.go(pickNumberInRange(MIN_RANDOM, MAX_RANDOM)));
    }

    private void printMap() {
        cars.forEach(car -> outputView.printPosition(car.getName(), car.getPosition()));
    }
}
