package warmup2;

public class stringYak {
    /*
        Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
    but the "a" can be any char. The "yak" strings will not overlap.

    stringYak("yakpak") → "pak"
    stringYak("pakyak") → "pak"
    stringYak("yak123ya") → "123ya"
     */

    public String stringYak(String str) {
        if(str.length() < 3){
            return str;
        }
        if(str.charAt(0) == 'y' && str.charAt(2) == 'k'){
            return stringYak(str.substring(3));
        }
        return str.charAt(0) + stringYak(str.substring(1));
    }

    public String stringYak2(String str) {
        if(str.length() < 3){
            return str;
        }
        String ret = "";
        for(int i = 0; i < str.length(); i++){
            if(i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i+2)=='k') {
                i = i + 2;
            } else {
                ret += str.charAt(i);
            }
        }
        return ret;
    }
}
