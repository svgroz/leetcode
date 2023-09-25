package org.svgroz;

import java.util.HashSet;

public class FindThePrefixCommonArrayOfTwoArrays {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] res = new int[A.length];

        HashSet<Integer> mem = new HashSet<>();
        mem.add(A[0]);
        res[0] = mem.add(B[0]) ? 0 : 1;

        for (int i = 1; i < res.length; i++) {
            int c = mem.add(A[i]) ? 0 : 1;
            c += mem.add(B[i]) ? 0 : 1;

            res[i] = c + res[i - 1];

        }

        return res;
    }
}
