package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int input = 0;
        int min = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            input = scanner.nextInt();
            if (min > input){
                min = input;
            }

        }
        System.out.println(min);

    }
}