package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int input;
        int max = Integer.MIN_VALUE;
        while (scanner.hasNextInt()){
            input = scanner.nextInt();
            if (input > max && input % 2 == 0){
                max = input;
            }


        }
        System.out.println(max);

    }
}