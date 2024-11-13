package string1;

public class deFront {
    /*
    Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'.
    The string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"

     */

    public String deFront(String str) {
        String ret = "";
        if(str.charAt(0) == 'a'){
            ret += "a";
        }
        if(str.charAt(1) == 'b'){
            ret += "b";
        }
        ret += str.substring(2);
        return ret;
    }
}
