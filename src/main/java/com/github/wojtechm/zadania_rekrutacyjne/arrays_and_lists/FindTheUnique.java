package com.github.wojtechm.zadania_rekrutacyjne.arrays_and_lists;

import com.github.wojtechm.zadania_rekrutacyjne.tools.Difficulty;
import com.github.wojtechm.zadania_rekrutacyjne.tools.Level;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Given a list of some elements
 * write a method that will find unique element.
 * For edge case handing see provided tests.
 *
 * [1, 1, 2, 1, 1]  => 2
 * ['a', 'b', 'b']  => 'a'
 *
 * There always will be just one unique element
 *
 * @author Wojciech Makieła
 */
@Difficulty(Level.MEDIUM)
class FindTheUnique {
    static <T extends Comparable<T>> T findUnique(List<T> list) {
        if (list == null || list.size() <= 2) throw new IllegalArgumentException();
        return list.stream()
                .filter(e -> Collections.frequency(list, e) == 1)
                .collect(Collectors.toList())
                .get(0);
    }
}
