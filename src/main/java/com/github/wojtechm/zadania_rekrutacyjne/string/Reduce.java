package com.github.wojtechm.zadania_rekrutacyjne.string;

import com.github.wojtechm.zadania_rekrutacyjne.tools.Difficulty;
import com.github.wojtechm.zadania_rekrutacyjne.tools.Level;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

/**
 * Given a String consisting of alphabetic characters only,
 * write a method - reduce that returns the given string with all equal characters
 * next to each other removed. Operation stops when no duplicates are neighboring;
 *
 * "book"   => "bk"
 * "abba"   => ""
 * "abcba"  => "abcba"
 * "aAaAaA" => "aAaAaA"
 * "ooabc"  => "abc"
 *
 * @author Wojciech Makieła
 */
@Difficulty(Level.MEDIUM)
class Reduce {

    static String reduce(String toReduce) {
        if (toReduce == null || toReduce.isEmpty()) throw new IllegalArgumentException("Cannot reduce null");
        Deque<Character> lettersStack = new ArrayDeque<>();
        for(int i = 0; i < toReduce.length(); i++){
            if (lettersStack.isEmpty() || !lettersStack.peekLast().equals(toReduce.charAt(i))) lettersStack.add(toReduce.charAt(i));
            else lettersStack.removeLast();
        }
        return lettersStack.stream()
                .map(ch -> ch.toString())
                .collect(Collectors.joining());
    }
}
