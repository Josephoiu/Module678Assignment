package org.textgame;

public class MazeConstructorHelper {
    private boolean isFinished = false;
    public String getPlayerInventory(Player player) {
        return player.getInventory();
    }
    public int getPlayerScore(Player player) {
        return player.getScore();
    }
    public boolean isFinished() {
        return isFinished;
    }
}
