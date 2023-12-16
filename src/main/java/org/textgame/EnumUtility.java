package org.textgame;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * The EnumUtility holds one method for creating a List out of any enumeration.
 */
public final class EnumUtility {
    /**
     * @param enumConstants Enumeration
     * @param <T> Generic Object
     * @return List of Enumeration Constants.
     */
    static <T> List<T> enumConstantstoList(Class<T> enumConstants){
        T[] arr = enumConstants.getEnumConstants();
        return arr == null ? Collections.emptyList() : Arrays.asList(arr);
    }
}
