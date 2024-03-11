package com.javarush.task.pro.task05.task0506;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int countInt = Integer.parseInt(reader.readLine());
        Scanner scanner = new Scanner(System.in);
        int countInt = scanner.nextInt();
        array = new int[countInt];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < countInt; i++) {
//            array[i] = Integer.parseInt(reader.readLine());
            array[i] = scanner.nextInt();
//            if (min > array[i]) {
//                min = array[i];
//            }

        }
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
//        for (int value : array){
//            System.out.println(value);
//        }
    }
}
