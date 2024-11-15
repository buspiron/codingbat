package warmup1;

public class max1020 {
    /*
        Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
    or return 0 if neither is in that range.

    max1020(11, 19) → 19
    max1020(19, 11) → 19
    max1020(11, 9) → 11
     */
    public int max1020(int a, int b) {
        if(b > a){
            int temp = a;
            a = b;
            b = temp;
        }
        if(a >= 10 && a <= 20) return a;
        if(b >= 10 && b <= 20) return b;
        return 0;
    }
}
