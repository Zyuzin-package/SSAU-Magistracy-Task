package org.example;

import java.util.*;

/**
 * Найти индекс начала наиболее длинной и непрерывной
 * последовательности одинаковых чисел в целочисленном массиве.
 */
public class Task5 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int a = random.nextInt(78 - 56 + 1);
            arr[i] = a;
        }
//        arr[8] = 56;
//        arr[9] = 56;

        arr[0] = 56;
        arr[1] = 56;

//        arr[6] = 78;
        arr[7] = 78;
        arr[8] = 78;
        arr[9] = 78;

        System.out.println(Arrays.toString(Arrays.stream(arr).toArray()));
        HashMap<Integer, Integer> countIndexMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                if (arr[i] == arr[i - 1] && count != 0) {
                    count++;
                    countIndexMap.put(count, i-count+1);
                    count = 0;
                }
            }
            if (i < arr.length - 1) {
                if (arr[i] == arr[i + 1]) {
                    count++;
                } else if (count != 0) {
                    countIndexMap.put(count + 1, i - 1);
                    count = 0;
                }
            }
        }

        Optional<Integer> maxIndex = countIndexMap.values().stream()
                .max(Integer::compareTo);
        System.out.println(maxIndex);
        System.out.println(countIndexMap);
    }
}
