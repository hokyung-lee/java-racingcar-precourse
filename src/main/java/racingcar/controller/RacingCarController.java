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
        racingCarView.printInputCarName();
        String playerName = Console.readLine();
        racingCarView.printInputRunCount();
        int tryCount = Integer.parseInt(Console.readLine());

    }
}
