package warmup2;

public class last2 {

    /*
        Given a string, return the count of the number of times that a substring length 2
    appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1
    (we won't count the end substring).
    In other words, count how many times, overlapping, last 2 characters of the String appear
    in the whole String (minus themselves at the end).

        last2("hixxhi") → 1
        last2("xaxxaxaxx") → 1
        last2("axxxaaxx") → 2
     */


    // recursive I've been asked for
    public int last2(String str) {
        if(str.length() < 3){
            return 0;
        }
        if(str.substring(0,2).equals(str.substring(str.length() - 2))){
            return 1 + last2(str.substring(1));
        }
        return last2(str.substring(1));
    }

    //standard iteration
    public int last2it(String str) {
        int strLen = str.length();
        if(strLen < 2){
            return 0;
        }
        String last2 = str.substring(strLen - 2);
        int counter = 0;
        for(int i = 0; i < strLen - 2; i++){
            if(str.substring(i, i+2).equals(last2)){
                counter++;
            }
        }
        return counter;
    }
}
