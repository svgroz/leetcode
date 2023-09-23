package org.svgroz;

import org.svgroz.algs.KnuthMorisPratt;

public class FindTheIndexOfTheOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        KnuthMorisPratt kmp = new KnuthMorisPratt();
        return kmp.indexOf(haystack, needle);
    }
}
