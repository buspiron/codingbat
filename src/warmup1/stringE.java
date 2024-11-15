package warmup1;

public class stringE {
    /*
    Return true if the given string contains between 1 and 3 'e' chars.

    stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false
     */

    public boolean stringE(String str) {
        if(str.length() < 1){
            return false;
        }
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'e') count++;
        }
        return count <= 3 && count > 0;
    }
}
