package racingcar.domain;

import java.util.Collections;

public class Game {
    private final Cars cars = new Cars();
    public Game(String playerList) throws IllegalArgumentException{
        String[] players = playerList.split(",");
        for (String player : players) {
            cars.addCar(new Car(player));
        }
    }

    public Cars playerList() {
        return cars;
    }
}
