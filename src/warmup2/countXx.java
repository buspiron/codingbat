package warmup2;

public class countXx {
    /*Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

    countXX("abcxx") → 1
    countXX("xxx") → 2
    countXX("xxxx") → 3
     */

    int countXX(String str) {
        if(str.length() < 2){
            return 0;
        }
        if(str.substring(0,2).equals("xx")){
            return 1 + countXX(str.substring(1));
        }
        return countXX(str.substring(1));
    }
}
