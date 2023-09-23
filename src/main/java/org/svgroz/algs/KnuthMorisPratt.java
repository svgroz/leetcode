package org.svgroz.algs;

public class KnuthMorisPratt {
    public int[] prefix(char[] s) {
        int[] pi = new int[s.length];

        for (int i = 1; i < s.length; i++) {
            int j = pi[i - 1];                            // берем предыдущий j

            while (j > 0 && s[j] != s[i]) {               // либо до первого совпадения либо начало - начало проще
                j = pi[j - 1];                            //  берем предыдущий индекс и переставляемся на него
            }

            if (s[j] == s[i]) {                           // успешно нашли пару - j можно увеличивать
                j++;
            }

            pi[i] = j;                                    // заполнились
        }

        return pi;
    }

    public int indexOf(String source, String pattern) {
        char[] rawSource = source.toCharArray(), rawPattern = pattern.toCharArray();
        int[] prefix = prefix(rawPattern);

        int current = 0;
        for (int i = 0; i < rawSource.length; i++) {
            while (current > 0 && rawSource[i] != rawPattern[current]) {
                current = prefix[current - 1];
            }

            if (rawSource[i] == rawPattern[current]) {
                current++;
            }

            if (current == rawPattern.length) {
                return i - (current - 1);
            }
        }

        return -1;
    }

}
