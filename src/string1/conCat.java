package string1;

public class conCat {
    /*
    Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
     */

    public String conCat(String a, String b){
        if(a.isEmpty() || b.isEmpty()){
            return a.isEmpty() ? b : a;
        }
        return a.charAt(a.length() - 1) == b.charAt(0) ? a + b.substring(1) : a + b;
    }
}
