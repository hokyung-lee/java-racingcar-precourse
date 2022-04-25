package racingcar.model;

import racingcar.domain.NumberStrategy;

public class Car {
    private final static String INVALID_CAR_NAME = "자동차 이름은 5글자를 초과할 수 없습니다.";
    private final static String INVALID_CAR_NAME_EMPTY = "자동차 이름은 1글자 이상이어야 합니다.";
    private final static int MAX_CAR_NAME_SIZE = 5;
    private final static int NUMBER_FOR_MOVE = 4;

    private final String name;
    private int position;
    public Car(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(INVALID_CAR_NAME_EMPTY);
        }
        if (name.length() > MAX_CAR_NAME_SIZE) {
            throw new IllegalArgumentException(INVALID_CAR_NAME);
        }
        this.name = name;
        this.position = 0;
    }

    public String getCarName() {
        return name;
    }

    public void moveForward() {
        this.position += 1;
    }

    public int getPosition() {
        return position;
    }

    public void moveOrStop(NumberStrategy numberStrategy) {
        if (numberStrategy.generateNumber() >= NUMBER_FOR_MOVE) {
            moveForward();
        }
    }
}
