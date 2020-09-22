package com.github.wojtechm.zadania_rekrutacyjne.arrays_and_lists;

import com.github.wojtechm.zadania_rekrutacyjne.tools.Difficulty;
import com.github.wojtechm.zadania_rekrutacyjne.tools.Level;

/**
 * Write a method to return a sorted array of integers created by merging 2 sorted arrays.
 *
 * [1], [2]             => [1,2]
 * [9,10,11], [5, 9]    => [5,9,9,10,11]
 * [1,3,5], [2,4,6]     => [1,2,3,4,5,6]
 * null, [1,2,3]        => [1,2,3]
 * [3,4,5], null        => [3,4,5]
 * null, null           => []
 *
 * @author Wojciech Makieła
 */
@Difficulty(Level.EASY)
class MergeSortedArrays {

    static int[] merge(int[] first, int[] second) {
        if (first == null && second == null) return new int[]{};
        if (first == null) return second;
        if (second == null) return first;
        int[] merged = new int[first.length + second.length];
        int firstIndex = 0, secondIndex = 0, mergedIndex = 0;
        while (firstIndex < first.length && secondIndex < second.length){
            if (first[firstIndex] <= second[secondIndex]){
                merged[mergedIndex++] = first[firstIndex++];
                continue;
            }
            merged[mergedIndex++] = second[secondIndex++];
        }
        while (firstIndex < first.length){
            merged[mergedIndex++] = first[firstIndex++];
        }
        while (secondIndex < second.length){
            merged[mergedIndex++] = second[secondIndex++];
        }
        return merged;
    }
}
