package com.javarush.task.pro.task03.task0301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Тепло или холодно
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int temp = Integer.parseInt(reader.readLine());

        if (temp >= 0) {
            System.out.println(warm);
        } else if (temp < 0) {
            System.out.println(cold);
        }
    }
}
