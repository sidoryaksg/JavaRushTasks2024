package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;
/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int min = Integer.MAX_VALUE;
        int nextMin = Integer.MAX_VALUE;
        int count = 0;
        int inputValue = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            inputValue = scanner.nextInt();
            if (inputValue < min) {
                nextMin = min;
                min = inputValue;
            } else if (inputValue < nextMin & inputValue != min){
                nextMin = inputValue;
            } else if (nextMin == min){
                nextMin = inputValue;

                }
            count++;
        }
        /*
        while (scanner.hasNextInt()) {
            inputValue = scanner.nextInt();
            if (inputValue > nextMin & nextMin == min) {
                nextMin = inputValue;
            }
            if (inputValue < nextMin) {
                if (inputValue < min) {
                    nextMin = min;
                    min = inputValue;
                } else
                    nextMin = inputValue;
            }
            count++;
        }

         */


        if (count > 1)
            System.out.println(nextMin);
    }

}
