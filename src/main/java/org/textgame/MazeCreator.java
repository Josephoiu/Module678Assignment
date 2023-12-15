package org.textgame;

import org.textgame.rooms.*;

public class MazeCreator {
    Room currentRoom;
    Player player;
    public MazeCreator(Player player) {
        this.player = player;
    }

    public void createMaze(){
        createRooms();
    }
    private void createRooms(){
        //Create Rooms
        EntranceRoom entranceRoom = new EntranceRoom("Entrance Room");
        RadioRoom radioRoom = new RadioRoom("Radio Broadcast Room");
        TerminalRoom terminalRoom = new TerminalRoom("Terminal Room");
        TerminalFoliageRoom terminalFoliageRoom = new TerminalFoliageRoom("Foliage Terminal Room");
        MechanicalTunnel mechanicalTunnel = new MechanicalTunnel("Mechanical Tunnel");
        SecretVentRoom secretVentRoom = new SecretVentRoom("Vent Room");
        NotFinishedComputerRoom notFinishedComputerRoom = new NotFinishedComputerRoom("Torn Computer Room", secretVentRoom);
        StrangeMachineRoom strangeMachineRoom = new StrangeMachineRoom("Strange Machine Room");
        GraffitiRoom graffitiRoom = new GraffitiRoom("Graffiti Room");
        GeneratorRoom generatorRoom = new GeneratorRoom("Generator Room");
        OfficeRoom officeRoom = new OfficeRoom("Office Hallway");
        WindowRoom windowRoom = new WindowRoom("Paneled Window Room");
        FileArchiveRoom fileArchiveRoom = new FileArchiveRoom("File Archive Room");
        ManagerRoom managerRoom = new ManagerRoom("Manager Room");
        PipeRoom pipeRoom = new PipeRoom("Pipe Room");
        WaterCoolerRoom waterCoolerRoom = new WaterCoolerRoom("Water Cooler Room");

        //Set Paths
        setDirectionRoom(entranceRoom,radioRoom,Directions.BOTTOM);

        setDirectionRoom(radioRoom,entranceRoom, Directions.TOP);
        setDirectionRoom(radioRoom, terminalRoom, Directions.WEST);
        setDirectionRoom(radioRoom, terminalFoliageRoom, Directions.EAST);

        setDirectionRoom(terminalRoom,radioRoom,Directions.EAST);
        setDirectionRoom(terminalRoom, mechanicalTunnel, Directions.NORTH);
        setDirectionRoom(terminalRoom, graffitiRoom,Directions.WEST);
        setDirectionRoom(terminalRoom, notFinishedComputerRoom, Directions.SOUTH);

        setDirectionRoom(mechanicalTunnel, terminalRoom, Directions.SOUTH);
        setDirectionRoom(mechanicalTunnel, strangeMachineRoom, Directions.NORTH);

        setDirectionRoom(strangeMachineRoom,mechanicalTunnel,Directions.SOUTH);

        setDirectionRoom(graffitiRoom,terminalRoom,Directions.EAST);
        setDirectionRoom(graffitiRoom,generatorRoom,Directions.SOUTH);

        setDirectionRoom(generatorRoom,graffitiRoom,Directions.NORTH);

        setDirectionRoom(notFinishedComputerRoom, terminalRoom,Directions.NORTH);

        setDirectionRoom(terminalFoliageRoom,radioRoom,Directions.WEST);
        setDirectionRoom(terminalFoliageRoom, officeRoom, Directions.NORTH);
        setDirectionRoom(terminalFoliageRoom,pipeRoom,Directions.SOUTH);

        setDirectionRoom(officeRoom,terminalFoliageRoom,Directions.SOUTH);
        setDirectionRoom(officeRoom,windowRoom,Directions.NORTH);
        setDirectionRoom(officeRoom,managerRoom,Directions.EAST);

        setDirectionRoom(windowRoom, officeRoom, Directions.SOUTH);

        setDirectionRoom(managerRoom, officeRoom, Directions.WEST);
        setDirectionRoom(managerRoom,fileArchiveRoom,Directions.NORTH);

        setDirectionRoom(fileArchiveRoom,managerRoom,Directions.SOUTH);

        setDirectionRoom(pipeRoom,terminalFoliageRoom,Directions.NORTH);
        setDirectionRoom(pipeRoom, waterCoolerRoom, Directions.EAST);

        setDirectionRoom(waterCoolerRoom, pipeRoom, Directions.WEST);

        setDirectionRoom(secretVentRoom, notFinishedComputerRoom, Directions.TOP);

        setCurrentRoom(entranceRoom);
    }
    private void setDirectionRoom(Room currentRoom, Room roomBeingSet, Directions directions){
        currentRoom.setRoom(roomBeingSet,directions);
    }
    private void setCurrentRoom(Room currentRoom){
        this.currentRoom = currentRoom;
    }
    public Room getCurrentRoom(){
        return currentRoom;
    }
}
