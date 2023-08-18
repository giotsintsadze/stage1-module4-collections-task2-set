package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> squareSet = new TreeSet<>();
        for (int num : sourceList) {
            squareSet.add(num * num);
        }
        return squareSet.subSet(lowerBound, true, upperBound, true);
    }
}
