package org.svgroz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KnuthMorisPrattTest {

    public static List<Pair<String, int[]>> prefixSource() {
        return List.of(
                new Pair<>("abcdabca", new int[]{0,0,0,0,1,2,3,1})
        );
    }

    @ParameterizedTest
    @MethodSource("prefixSource")
    void prefix(Pair<String, int[]> source) {
        KnuthMorisPratt kmp = new KnuthMorisPratt();
        Assertions.assertArrayEquals(source.right(), kmp.prefix(source.left()));
    }
}