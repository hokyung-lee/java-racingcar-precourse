package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public int totalCar() {
        return cars.size();
    }
}
