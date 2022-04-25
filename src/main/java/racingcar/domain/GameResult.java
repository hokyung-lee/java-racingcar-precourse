package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameResult {
    List<GameStatus> status = new ArrayList<>();
    private int executeCount = 0;

    public int totalExecuteCount() {
        return executeCount;
    }

    public void addStatus(GameStatus gameStatus) {
        this.executeCount += 1;
        this.status.add(gameStatus);
    }

    public List<GameStatus> getGameResult() {
        return Collections.unmodifiableList(status);
    }
}
