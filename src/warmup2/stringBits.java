package warmup2;

public class stringBits {
    /*
        Given a string, return a new string made of every other char
    starting with the first, so "Hello" yields "Hlo".

    stringBits("Hello") → "Hlo"
    stringBits("Hi") → "H"
    stringBits("Heeololeo") → "Hello"
     */

    public String stringBits(String str) {
        String ret = "";
        for(int i = 0; i < str.length(); i++){
            if(i % 2 == 0) ret += str.charAt(i);
        }
        return ret;
    }
}
