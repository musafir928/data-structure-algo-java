package HashMap;

import java.util.HashMap;

public class FirstRepeated {
    public static void main(String[] args) {
        String s = "a green apple";
        System.out.println("findFirstRepeated(s) = " + findFirstRepeated(s));

    }


    public static Character findFirstRepeated (String s) {
        if(s.length() == 0) return null;
        HashMap<Character, Integer> charMap = new HashMap<>();
        for(Character e: s.toCharArray()) {
            if(charMap.containsKey(e)) {
                return e;
            } else {
                charMap.put(e, 1);
            }
        }

        return Character.MIN_VALUE;
    }

}
