package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        List<Car> carList = cars.carList();
        List<Integer> gameStatus = new ArrayList<>();
        for (Car car : carList) {
            car.moveOrStop(new RandomNumberStrategy());
            gameStatus.add(car.getPosition());
        }
        gameResult.addStatus(new GameStatus(gameStatus));
    }

    public GameResult gameResult() {
        return gameResult;
    }
}
