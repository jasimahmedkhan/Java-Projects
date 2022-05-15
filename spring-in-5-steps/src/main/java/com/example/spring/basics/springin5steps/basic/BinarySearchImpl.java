package com.example.spring.basics.springin5steps.basic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") // not a good practise
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;

    // constructor injection
//    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }

    // setter injection
//    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }

    public int binarySearch(int[] numbers, int numbersToSearchFor){

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        // search the array
        // return the result

        return 3;
    }


}
