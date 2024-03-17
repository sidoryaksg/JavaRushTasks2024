package com.javarush.task.pro.task05.task0511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nArray = Integer.parseInt(reader.readLine());
        multiArray = new int[nArray][];
        for (int i = 0; i < nArray; i++) {
            int value = Integer.parseInt(reader.readLine());

            multiArray[i] = new int[value];
        }
//        System.out.println(Arrays.deepToString(multiArray));


    }
}

