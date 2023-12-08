package org.textgame;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.textgame.EnumUtility.enumConstantstoList;

class EnumUtilityTest {
    Directions directions;
    @Test
    @DisplayName("Check if Null")
    void enumConstantList(){
        assertNotNull(Directions.class, "Null");
    }

    @Test
    @DisplayName("Check if Value is in List")
    void valueCheck(){
        assertEquals(Directions.NORTH, enumConstantstoList(Directions.class).get(0));
        assertEquals(Directions.SOUTH, enumConstantstoList(Directions.class).get(1));
    }

    @Test
    @DisplayName("Simple Print Out")
    void printEnumCons(){
        List<Directions> enumConstants = enumConstantstoList(Directions.class);
        enumConstants.stream().forEach(System.out::println);
    }

    @Test
    @DisplayName("Check Size")
    void checkSize(){
        List<Directions> enumConstants = enumConstantstoList(Directions.class);
        System.out.println(enumConstants.size());
    }

}