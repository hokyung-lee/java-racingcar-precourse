package racingcar.domain;

import java.util.Collections;

public class Game {
    private final Cars cars = new Cars();
    private final GameResult gameResult = new GameResult();
    public Game(String playerList) throws IllegalArgumentException{
        String[] players = playerList.split(",");
        for (String player : players) {
            cars.addCar(new Car(player));
        }
    }

    public Cars playerList() {
        return cars;
    }

    public GameResult run(int runCount) {
        for (int i=0; i < runCount; i++) {
            executeGame();
        }
        return gameResult;
    }

    private void executeGame() {
        gameResult.addExecutionCount();
    }
}
