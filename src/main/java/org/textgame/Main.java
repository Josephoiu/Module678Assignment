package org.textgame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        MazeNavigatorService maze = new MazeNavigatorService();
        SystemVersion systemVersion = new SystemVersion(maze,player);

        systemVersion.printInstructions();
        while (!maze.isFinished()) { //Main loop
            maze.getInstance(player);
            systemVersion.printInfo(maze.getCurrentRoomDescription(),maze.currentRoomExits());

            systemVersion.userInput();
            systemVersion.printLine();
            systemVersion.userOptions();
        }
        systemVersion.printPlayerScore();
    }
}