package com.javarush.task.pro.task05.task0519;

import java.util.Arrays;

import static java.util.Arrays.sort;

/* 
Есть ли кто?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        //напишите тут ваш код
        int result = -1;
//        System.out.println(Arrays.binarySearch(array, element));
        int[] tempArray = Arrays.copyOf(array, array.length);
        Arrays.sort(tempArray);
//        System.out.println(Arrays.toString(tempArray));
        result = Arrays.binarySearch(tempArray,element);
        System.out.println(result < 0 ? "false" : "true");
    }
}
