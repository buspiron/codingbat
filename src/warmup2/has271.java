package warmup2;

public class has271 {
    /*
        Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5,
    followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

    has271([1, 2, 7, 1]) → true
    has271([1, 2, 8, 1]) → false
    has271([2, 7, 1]) → true
     */

    public boolean has271(int[] nums) {
        for(int i = 0; i < nums.length - 2; i++){
            int val1 = nums[i];
            int val2 = nums[i+1];
            int val3 = nums[i+2];
            if(val2 == val1 + 5 && (Math.abs(val3 - (val1 - 1)) <= 2)){
                return true;
            }
        }
        return false;
    }
}
