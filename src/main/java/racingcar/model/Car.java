package racingcar.model;

public class Car {
    private final static String INVALID_CAR_NAME = "자동차 이름은 5글자를 초과할 수 없습니다.";
    private final String name;
    private int position;
    public Car(String name) {
        if (name.length() > 5) {
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
}
