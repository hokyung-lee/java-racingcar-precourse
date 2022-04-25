package racingcar.domain;

public class GameResult {
    private int executeCount = 0;

    public void addExecutionCount() {
        executeCount += 1;
    }

    public int totalExecuteCount() {
        return executeCount;
    }
}
