package racingcar.model;

import racingcar.domain.Cars;
import racingcar.domain.Game;
import racingcar.domain.GameResult;
import racingcar.domain.GameStatus;

import java.util.Collections;
import java.util.List;

public class RacingCarModelCommandLine implements RacingCarModel {

    private Game game;
    private GameResult gameResult;
    @Override
    public void init(String playerName) {
        game = new Game(playerName);
    }

    @Override
    public void run(int tryCount) {
        gameResult = game.run(tryCount);
    }

    @Override
    public List<GameStatus> getStatus() {
        return Collections.unmodifiableList(gameResult.getGameResult());
    }

    public Cars getPlayer() {
        return game.playerList();
    }

    @Override
    public String getWinner() {
        return game.getWinner();
    }
}
