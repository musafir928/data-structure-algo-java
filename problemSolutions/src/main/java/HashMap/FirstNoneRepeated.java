package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FirstNoneRepeated {
    public static void main(String[] args) {
        String s = "a green apple";
        System.out.println("findFirstNoneRepeated(s) = " + findFirstNoneRepeated(s));

    }


    public static Character findFirstNoneRepeated (String s) {
        if(s.length() == 0) return Character.MIN_VALUE;
        HashMap<Character, Integer> charMap = new HashMap<>();
        char[] charArray = s.toCharArray();
        for(Character e: charArray) {
            if(charMap.containsKey(e)) {
                charMap.put(e, charMap.get(e)+1);
            } else {
                charMap.put(e, 1);
            }
        }
        for(Character e: charArray) {
            if(charMap.get(e) == 1) {
                return e;
            }
        }
        return Character.MIN_VALUE;
    }
}
