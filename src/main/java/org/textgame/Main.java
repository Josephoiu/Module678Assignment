package org.textgame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.setHealth(100);
        MazeNavigatorService maze = new MazeNavigatorService();
        SystemVersion systemVersion = new SystemVersion(maze,player);

        systemVersion.printInstructions();
        while (!maze.isFinished()) { //Main loop
            maze.getInstance(player);
            systemVersion.printInfo(maze.getCurrentRoomName(),maze.getCurrentRoomDescription(),maze.currentRoomExits());

            systemVersion.userInput();
            systemVersion.printLine();
            systemVersion.userOptions();
        }
        systemVersion.printPlayerScore();
    }
}