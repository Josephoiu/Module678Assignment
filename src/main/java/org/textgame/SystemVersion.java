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
        System.out.println("Score: " + player.getScore());
    }
    public void userOptions(){
        setUserInput(checkUserInput(getInput()));
        switch (getInput().charAt(0)) {
            case 'i' -> System.out.println("\n" + mazeNavigatorService.interactWithCurrentRoom());
            case 'l' -> System.out.println("\n" + mazeNavigatorService.lootCurrentRoom());
            case 'x' -> System.out.println("\n" + mazeNavigatorService.exitCurrentRoom());
            case 'v' -> System.out.println("\n" + player.getInventory());
            case 'a' -> System.out.println("\n" + player.getAttacks());
            case 'c' -> printInstructions();
            default -> mazeNavigatorService.move(input.toLowerCase().charAt(0));
        }
    }
    public void userInput(){
        input = sc.nextLine();
    }
    private String checkUserInput(String input){
        if(input.isBlank()){
            return "c";
        } else {
            return input;
        }
    }
    public void printLine(){
        System.out.println("-*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*-");
    }
    private String getInput() {
        return input;
    }
    private void setUserInput(String input){
        this.input = input;
    }
    public void printInstructions(){
        System.out.println("In this game, EVERY item is a weapon!");
        instructions.getInstructions().forEach(System.out::println);
    }
}
