package org.example;

import java.util.*;

/**
 * Найти индекс начала наиболее короткой (не менее двух) и
 * непрерывной последовательности одинаковых чисел в целочисленном
 * массиве.
 */
public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int a = random.nextInt(78 - 56 + 1);
            arr[i] = a;
        }
//        arr[8] = 56;
//        arr[9] = 56;

        arr[1] = 56;
        arr[2] = 56;

        arr[3] = 78;
        arr[4] = 78;
        arr[5] = 78;

        System.out.println(Arrays.toString(Arrays.stream(arr).toArray()));
        List<Integer > list = new ArrayList<>();
        int index = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                if (count == 1) {
                    if(arr[i] != arr[i + 1]) {
                        index = i-1;
                        list.add(index);
                    }
                }
                if (arr[i] == arr[i + 1]) {
                    count++;
                } else {
                    count = 0;
                }
            }
            if(arr[arr.length-2] == arr[arr.length-1]){
                index = arr.length-2;
                break;
            }
            if(arr[0] == arr[1]){
                index =1;
                break;

            }
        }
        System.out.println(index);
        System.out.println(list);
    }

}
