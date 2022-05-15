package com.example.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{
    public int[] sort(int[] numbers) {
        // sorting the list of numbers in an array
        return numbers;
    }
}
