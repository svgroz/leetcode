package org.svgroz;

public class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        if (word.length() < 2) {
            return word;
        }

        int idx = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            return word;
        }

        StringBuilder res = new StringBuilder();

        for (int i = idx; i >= 0; i--) {
            res.append(word.charAt(i));
        }

        res.append(word.substring(idx + 1, word.length()));

        return res.toString();
    }
}
