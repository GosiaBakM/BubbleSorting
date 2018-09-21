package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BubbleSorting {
    List<Integer> randomList;

    public List<Integer> creatingRandomList() {
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomList.add(random.nextInt(100));
        }
        return randomList;
    }

    public List<Integer> sorting() {
        List<Integer> list = creatingRandomList();;
        ex: for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > (list.get(i + 1))) {
                    int replaece = list.get(i);
                    list.add(i, list.get(i + 1));
                    list.add(i + 1, replaece);
                }
                else break ex;
            }
        }
        return list;
    }

}
