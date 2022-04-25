package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.RacingCarModel;
import racingcar.view.RacingCarView;

public class RacingCarController {
    private final RacingCarView racingCarView;
    private final RacingCarModel racingCarModel;

    public RacingCarController(RacingCarView racingCarView, RacingCarModel racingCarModel) {
        this.racingCarView = racingCarView;
        this.racingCarModel = racingCarModel;
    }

    public void play() {
        init();
    }

    private void init() {
        String playerName = getInputCarName();
        int tryCount = getInputTryCount();

        play(playerName, tryCount);
        printResult();
    }

    private void play(String playerName, int tryCount) {
        racingCarModel.init(playerName);
        racingCarModel.run(tryCount);
    }


    private String getInputCarName() {
        racingCarView.printInputCarName();
        String playerName = Console.readLine();
        return playerName;
    }

    private int getInputTryCount() {
        racingCarView.printInputRunCount();
        int tryCount = Integer.parseInt(Console.readLine());
        return tryCount;
    }

    private void printResult() {
        racingCarView.printStatus(racingCarModel.getStatus(), racingCarModel.getPlayer());
        racingCarView.printWinner(racingCarModel.getWinner());
    }
}
