package racingcar.controller;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.Car;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class CarController {
    private final InputView inputView;
    private final OutputView outputView;
    private List<Car> cars;

    public CarController(OutputView outputView) {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void start() {
        inputUser();
    }

    private void inputUser() {
        List<String> users = inputView.inputNames();
        cars = users.stream().map(Car::new).collect(Collectors.toList());
    }
}
