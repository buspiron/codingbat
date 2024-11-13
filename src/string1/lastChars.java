package string1;

public class lastChars {
    /*
    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
     */

    public String lastChars(String a, String b){
        String a1 = !a.isEmpty() ? a.substring(0,1) : "@";
        String b1 = !b.isEmpty() ? b.substring(b.length() - 1) : "@";
        return a1 + b1;
    }
}
