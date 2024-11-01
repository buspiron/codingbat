package warmup2;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class arrayCount9 {
    /*
    Given an array of ints, return the number of 9's in the array.

    arrayCount9([1, 2, 9]) → 1
    arrayCount9([1, 9, 9]) → 2
    arrayCount9([1, 9, 9, 3, 9]) → 3
     */

    public int arrayCount9(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 9) count++;
        }
        return count;
    }

    public int arrayCount9v2(int[] nums) {
        return (int) Arrays.stream(nums)
                .filter(n -> n == 9)
                .count();
    }

    public int arrayCount9v3(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int count = (nums[0] == 9) ? 1 : 0;
        return count + arrayCount9(Arrays.copyOfRange(nums, 1, nums.length));
    }
}
