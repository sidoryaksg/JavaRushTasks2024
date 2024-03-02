package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int first = 0;
        int second = 0;
        double result;
        if (scanner.hasNextInt()) {
            first = scanner.nextInt();
        }
        if (scanner.hasNextInt()) {
            second = scanner.nextInt();
        }
        result = 1.0 * first / second;
        System.out.println(result);

    }
}