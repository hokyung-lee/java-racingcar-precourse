package racingcar.model;

import racingcar.domain.Game;

public class RacingCarModelCommandLine implements RacingCarModel {

    private Game game;
    @Override
    public void init(String playerName) {
        game= new Game(playerName);
    }
}
