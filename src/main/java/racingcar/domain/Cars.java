package racingcar.domain;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public List<Car> carList() {
        return cars;
    }
}
