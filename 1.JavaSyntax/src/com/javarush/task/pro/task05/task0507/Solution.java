package com.javarush.task.pro.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arrayLenghth = 0;
        int max = Integer.MIN_VALUE;
        try {

        arrayLenghth = Integer.parseInt(reader.readLine());
        array = new int[arrayLenghth];
            for (int i = 0; i < arrayLenghth; i++) {
                array[i] = Integer.parseInt(reader.readLine());
                if (max < array[i])
                        max = array[i];
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getStackTrace());
        }
        System.out.println(max);


    }
}
