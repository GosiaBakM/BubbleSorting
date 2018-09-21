package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BubbleSorting {
    List<Integer> randomList;

    public List<Integer> creatingRandomList(){
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomList.add(random.nextInt(100));
        }
        return randomList;
    }


}
