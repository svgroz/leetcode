package org.svgroz;

public class KnuthMorisPratt {
    public int[] prefix(String s) {
        int[] pi = new int[s.length()];

        for (int i = 1; i < s.length(); i++) {
            int j = pi[i - 1];                            // берем предыдущий j

            while (j > 0 && s.charAt(j) != s.charAt(i)) { // либо до первого совпадения либо начало - начало проще
                j = pi[j - 1];                            //  берем предыдущий индекс и переставляемся на него
            }

            if (s.charAt(j) == s.charAt(i)) {             // успешно нашли пару - j можно увеличивать
                j++;
            }

            pi[i] = j;                                    // заполнились
        }

        return pi;
    }

}
