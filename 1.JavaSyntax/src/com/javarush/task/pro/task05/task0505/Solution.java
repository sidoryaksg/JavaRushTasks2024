package com.javarush.task.pro.task05.task0505;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(reader.readLine());
            }
            if (n % 2 > 0) {
                for (int i = 0; i < n; i++) {
                    System.out.println(array[i]);

                }
            } else {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.println(array[i]);
                }

            }
        }
    }
}

