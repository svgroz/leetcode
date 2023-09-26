package org.svgroz;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int res = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int l = i, tmp = 0; l < nums.length; l++) {
                tmp += nums[l];
                if (tmp == k) {
                    res++;
                }
            }
        }

        return res;
    }
}
