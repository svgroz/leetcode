package org.svgroz;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();

        int s = 0, r = 0;

        while(r < nums.length) {
            if (s == r) {
                r++;
                continue;
            }

            if (Math.abs(nums[r] - nums[r - 1]) > 1) {

                if (r - s == 1) {
                    ranges.add(nums[s] + "");
                } else {
                    ranges.add(nums[s] + "->" + nums[r - 1]);
                }

                s = r;
            }

            r++;
        }

        if (s != r) {
            if (r - s == 1) {
                ranges.add(nums[s] + "");
            } else {
                ranges.add(nums[s] + "->" + nums[r - 1]);
            }
        }

        return ranges;
    }
}
