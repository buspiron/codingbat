package string1;

public class FirstTwo {
    /*
    Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.

firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"
     */

    public String firstTwo(String str) {
        int n = 2;
        if (str.length() < 2) n = str.length();
        return str.substring(0, n);
    }
}
