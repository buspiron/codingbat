package warmup2;

public class stringX {
    /*
    Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

    stringX("xxHxix") → "xHix"
    stringX("abxxxcd") → "abcd"
    stringX("xabxxxcdx") → "xabcdx"
     */

    public String stringX(String str) {
        if(str.length() <= 1){
            return str;
        }
        String ret = "";
        ret += str.charAt(0);
        for(int i = 1; i < str.length() - 1; i++){
            if(str.charAt(i) != 'x'){
                ret += str.charAt(i);
            }
        }
        ret += str.charAt(str.length() - 1);
        return ret;
    }
}
