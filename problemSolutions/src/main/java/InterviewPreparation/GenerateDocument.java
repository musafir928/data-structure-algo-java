package InterviewPreparation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class GenerateDocument {

    public static void main(String[] args) {
        System.out.println(method1("", "")); // true
        System.out.println(method1("adil", "")); // true
        System.out.println(method1("adil", "dila")); // true
        System.out.println(method1("aaaaaa", "aaa")); // true
        System.out.println(method1("aaaaaa", "aaab")); // false
    }

    public static boolean method1(String chars, String doc) {
        // edge cases
        if(doc.equals("")) return true;
        if(chars.length()<doc.length()) return false;

        HashMap<Character, Integer> charMap = new HashMap<>();
        for(char c : chars.toCharArray()) {
            if(charMap.get(c) == null) {
                charMap.put(c, 1);
            } else {
                charMap.put(c, charMap.get(c)+1);
            }
        }

        for(char c : doc.toCharArray()) {
            if(charMap.get(c) == null || charMap.get(c) <=0) {
                return false;
            } else {
                charMap.put(c, charMap.get(c)-1);
            }
        }
        return true;
    }

    public static String sortString(String inputString)
    {
        char[] tempArray = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}
