package org.svgroz;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        var cache = new HashMap<Character, Integer>();

        for (char c: s.toCharArray()) {
            cache.put(c, cache.getOrDefault(c, 0) + 1);
        }

        for (char c: t.toCharArray()) {
            var count = cache.getOrDefault(c, 0);
            if (count < 1) {
                return false;
            }

            cache.put(c, count - 1);
        }

        for (var value: cache.values()) {
            if (value > 0) {
                return false;
            }
        }

        return true;
    }
}
