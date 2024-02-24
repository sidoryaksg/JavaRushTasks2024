package com.javarush.task.pro.task04.task0402;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String text = " любит меня.";
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int i = 0;
        while (i < 10) {
            System.out.println(name + text);

            i++;
        }

    }
}
