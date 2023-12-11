package org.textgame;
import java.util.ArrayList;
import java.util.List;

import static org.textgame.EnumUtility.enumConstantstoList;

public class Instructions {
    private List<Directions> enumDirections = enumConstantstoList(Directions.class);
    private List<GameMechanics> enumExtraMechanics = enumConstantstoList(GameMechanics.class);
    private List<String> instructions = new ArrayList<String>();
    public void createInstructions(){
        setDirections();
        addExtraMechanic();
    }
    private void setDirections(){
        for (Directions enumDirection : enumDirections) {
            instructions.add("'" + enumDirection.getSingleChar() + "'" + " - " + enumDirection.getName());
        }
    }
    private void addExtraMechanic(){
        for (GameMechanics enumMechanic : enumExtraMechanics) {
            instructions.add("'" + enumMechanic.getSingleChar() + "'" + " - " + enumMechanic.getName());
        }
    }
}
