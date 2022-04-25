package racingcar.model;

import racingcar.domain.Game;
import racingcar.domain.GameResult;

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
}
