package racingcar.model;

import racingcar.domain.Cars;
import racingcar.domain.GameStatus;

import java.util.List;

public interface RacingCarModel {

    void init(String playerName);

    void run(int tryCount);

    List<GameStatus> getStatus();
    Cars getPlayer();

    String getWinner();
}
