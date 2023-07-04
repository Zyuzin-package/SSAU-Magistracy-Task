package org.example;

import java.util.Arrays;
import java.util.Random;

/**
 * Найти медиану в массиве вещественных чисел. Для вычисления
 * медианы массив следует упорядочить по возрастанию и, в случае нечётного
 * количества членов, взять средний элемент, а в случае чётного количества
 * членов взять среднее арифметическое между двумя «средними» членами.
 */
public class Task8 {
    public static void main(String[] korks) {
        int resultOdd = 0;
        double resultEven = 0;

        int[] odd = new int[]{14, 17, 6, 20, 19, 4, 10, 5, 20};
        int[] even = new int[]{14, 17, 6, 20, 19, 4, 10, 5, 20, 56};

        odd = Arrays.stream(odd).sorted().toArray();
        even = Arrays.stream(even).sorted().toArray();
        System.out.println("Odd: "+Arrays.toString(odd));
        System.out.println("Even: "+Arrays.toString(even));
        if(odd.length%2!=0){
            resultOdd=odd[odd.length/2 ];
        }

        if(even.length%2==0){
            resultEven = (double) (even[even.length / 2] + even[(even.length / 2) - 1]) /2;
        }

        System.out.println("Result odd: "+resultOdd);
        System.out.println("Result even: "+resultEven);
    }
}
