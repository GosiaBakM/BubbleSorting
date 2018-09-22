package main.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {

    public static void main(String [] args){
        BubbleSorting bubbleSorting = new BubbleSorting();
        System.out.println(bubbleSorting.sortingRandomList());
        System.out.println(bubbleSorting.sortingGivenList(new ArrayList<Integer>(Arrays.asList(35, 6, 39, 22))));
    }
}
