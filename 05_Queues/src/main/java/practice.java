import java.util.Arrays;
import java.util.Locale;

public class practice {

    public static void main(String[] args) {
        String s = "leetcode";
        String vowels = "aeiou";
        int l = 0;
        int r = s.length()-1;
        boolean bl = false; boolean br = false;
        while(l<r) {
            if(!bl && !vowels.contains(""+s.charAt(l)) && !vowels.toUpperCase().contains(""+s.charAt(l))) {
                l++;
            } else {
                bl = true;
            }

            if(!br && !vowels.contains(""+s.charAt(r)) && !vowels.toUpperCase().contains(""+s.charAt(r))) {
                r--;
            } else {
                br = true;
            }

            if(br && bl) {
                s= swap(s, l,r);
                l++;
                r--;
                bl = br  = false;
            }
        }
        System.out.println(s);
    }

    public static String swap(String s, int l, int r) {
        return s.substring(0,l) + s.charAt(r) + s.substring(l+1, r) + s.charAt(l)+s.substring(r+1);
    }


}
