package string1;

public class frontAgain {
    /*
    Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
     */

    public boolean frontAgain(String str){
        if(str.length() < 2){
            return false;
        }
        String ch = str.substring(0, 2);
        return str.startsWith(ch) && str.endsWith(ch);
    }
}
