

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String Str1 = "silent";
        String str2 = "listen";
        char[] a = Str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b)) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }

    }
}

