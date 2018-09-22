package main.java;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BubbleSorting {
    private List<Integer> randomList;

    public List<Integer> creatingRandomList() {
        this.randomList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomList.add(random.nextInt(100));
        }
        return randomList;
    }

    private List<Integer> sortingRandomList() {
        ex: for (int j = 0; j < randomList.size(); j++) {
            for (int i = 0; i < randomList.size() - 1; i++) {
                if (randomList.get(i) > (randomList.get(i + 1))) {
                    int replaece = randomList.get(i);
                    randomList.set(i, randomList.get(i + 1));
                    randomList.set(i + 1, replaece);
                }
            }
        }
        return randomList;
    }

    public List<Integer> sortingGivenList(List <Integer> list) {
        ex: for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > (list.get(i + 1))) {
                    int replaece = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, replaece);
                }
            }
        }
        return list;
    }

}
