package racingcar.domain;

import racingcar.domain.NumberStrategy;

public class Car {

    private final static int NUMBER_FOR_MOVE = 4;

    private final CarName carName;
    private final CarPosition carPosition;
    public Car(String name) throws IllegalArgumentException {
        carName = new CarName(name);
        carPosition = new CarPosition();
    }

    public String getCarName() {
        return carName.toString();
    }

    public void moveForward() {
        carPosition.forwardPosition();
    }

    public int getPosition() {
        return carPosition.currentPosition();
    }

    public void moveOrStop(NumberStrategy numberStrategy) {
        if (numberStrategy.generateNumber() >= NUMBER_FOR_MOVE) {
            moveForward();
        }
    }
}
