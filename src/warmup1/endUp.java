package warmup1;

public class endUp {

    /*
        Given a string, return a new string where the last 3 chars are now in upper case.
    If the string has less than 3 chars, uppercase whatever is there.
    Note that str.toUpperCase() returns the uppercase version of a string.

    endUp("Hello") → "HeLLO"
    endUp("hi there") → "hi thERE"
    endUp("hi") → "HI"
     */

    public String endUp(String str) {
        int strLen = str.length();
        if(strLen < 3) return str.toUpperCase();
        return str.substring(0, strLen - 3) + str.substring(strLen -3).toUpperCase();
    }
}
