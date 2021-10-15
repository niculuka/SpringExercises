package com.example.SpringExercises.ex4;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class ListUtil {

    public int sumElements(final List<Integer> ints) {
        return ints.stream().reduce(0, Integer::sum);
    }
}
