package org.textgame;

import java.util.Scanner;

public class SystemVersion {
    Scanner sc = new Scanner(System.in);
    MazeNavigatorService mazeNavigatorService;
    Player player;
    Instructions instructions = new Instructions();
    String input;
    public SystemVersion(MazeNavigatorService mazeNavigatorService,Player player) {
        this.mazeNavigatorService = mazeNavigatorService;
        this.player = player;
        instructions.createInstructions();
    }

    public void printInfo(String... items){
        for (String item: items) {
            System.out.println("\n" + item);
        }
    }
    public void printPlayerScore(){
        System.out.println(player.getInventory());
    }
    public void userInput(){
        input = sc.nextLine();
    }
    public void userOptions(){
        switch (getInput().charAt(0)) {
            case 'i' -> System.out.println("\n" + mazeNavigatorService.interactWithCurrentRoom());
            case 'l' -> System.out.println("\n" + mazeNavigatorService.lootCurrentRoom());
            case 'x' -> System.out.println("\n" + mazeNavigatorService.exitCurrentRoom());
            case 'v' -> System.out.println("\n" + player.getInventory());
            case 'c' -> printInstructions();
            default -> mazeNavigatorService.move(input.toLowerCase().charAt(0));
        }
    }
    public void printLine(){
        System.out.println("-*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*-");
    }
    private String getInput() {
        return input;
    }
    public void printInstructions(){
        instructions.getInstructions().forEach(System.out::println);
    }
}
