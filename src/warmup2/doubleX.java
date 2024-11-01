package warmup2;

public class doubleX {
    /*
        Given a string, return true if the first instance of "x"
    in the string is immediately followed by another "x".

    doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true
     */

    boolean doubleX(String str) {
        int x = str.indexOf('x');
        if(x == -1) return false;
        if(x + 1 >= str.length()) return false;
        return str.startsWith("xx", x);
    }
}
