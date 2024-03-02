package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner (System.in);
        Double radius = 0.0;
        if (scanner.hasNextDouble()) {
            radius = scanner.nextDouble();
        }
        Double pi = 3.14;
        int s = (int) (pi * radius * radius);
        System.out.println(s);


    }
}