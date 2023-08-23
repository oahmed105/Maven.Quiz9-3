package rocks.zipcode.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(str.length()/2, Character.toUpperCase(getMiddleCharacter(str)));

        return sb.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(str.length()/2, Character.toLowerCase(getMiddleCharacter(str)));

        return sb.toString();
    }

    /* isogram (plural isograms) A word or phrase in which each letter occurs the same number of times. read the tests. */
    public static Boolean isIsogram(String str) {
        for (int i = 0; i < str.length(); i++) {

            // Counting occurrences of s[i]
            int count = 1;
            while (i + 1 < str.length()
                    && str.charAt(i)
                    == str.charAt(i + 1)) {
                i++;
                count++;
            }
            if (count == 1) {
                return true;
            }
        }
        return false;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length() - 1; i++){
            if (str.charAt(i) == str.charAt(i + 1)){
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
//        String newStr = "";
//        for (int i = 0; i < str.length(); i++){
//            char charAtPosition = str.charAt(i);
//            if (charAtPosition)
//        }
        return null;
    }

    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            chars[i] = Character.isUpperCase(chars[i])
                    ? Character.toLowerCase(chars[i])
                    : Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }
}
