package string1;

public class minCat {
    /*
    Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
     */

    public String minCat(String a, String b){
        return a.substring(Math.max(0, a.length() - b.length())) + b.substring(Math.max(0, b.length() - a.length()));
    }
}
