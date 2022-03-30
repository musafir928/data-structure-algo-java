import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class a {
    int b = 1;
}

public class general {
    public static void main(String[] args) {
        System.out.println("convert(\"PAYPALISHIRING\",3) = " + convert("PAYPALISHIRING", 3));

    }


    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        ArrayList<String> arr = new ArrayList<String>(Collections.nCopies(numRows, ""));
        int current = 0;
        int step = 0;
        for (char c : s.toCharArray()) {

            arr.set(current, arr.get(current) + c);

            if (current == 0) {
                step = 1;
            }
            if (current == numRows - 1) {
                step = -1;
            }
            current += step;
        }
        return arr.stream().reduce("",(y,e)-> y+e);
    }
}
