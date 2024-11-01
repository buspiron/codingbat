package warmup1;

public class loneTeen {
    /*
    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 2 int values, return true if one or the other is teen, but not both.

    loneTeen(13, 99) → true
    loneTeen(21, 19) → true
    loneTeen(13, 13) → false
     */

    public boolean loneTeen(int a, int b) {
        return isTeen(a) ^ isTeen(b);
    }

    private boolean isTeen(int i){
        return (i >= 13 && i <= 19);
    }
}
