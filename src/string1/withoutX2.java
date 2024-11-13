package string1;

public class withoutX2 {
    /*
    Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.

withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
     */

    public String withoutX2(String str) {
        if(str == null || str.isEmpty()){
            return str;
        }
        if(str.length() == 1) {
            if (str.charAt(1) == 'x') str = "";
            return str;
        }
        if (str.charAt(1) == 'x') str = str.charAt(0) + str.substring(2);
        if(str.startsWith("x")) str = str.substring(1);
        return str;
    }

}
