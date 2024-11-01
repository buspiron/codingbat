package warmup2;

public class altPairs {
    /*
    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

    altPairs("kitten") → "kien"
    altPairs("Chocolate") → "Chole"
    altPairs("CodingHorror") → "Congrr"
     */

    public String altPairs(String str) {
        String ret = "";
        int counter = 0;
        for(int i = 0; i < str.length(); i++){
            if(counter > 3) counter = 0;
            if(counter < 2){
                ret += str.charAt(i);
            }
            counter++;
        }
        return ret;
    }

    public String altPairs2(String str) {
        String ret = "";
        for(int i = 0; i < str.length(); i += 4){
            int endChar = i + 2;
            if(endChar > str.length()) endChar = str.length();
            ret += str.substring(i, endChar);
        }
        return ret;
    }
}
