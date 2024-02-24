package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int x = 0;
        int y = 0;
        while (y < 5) {
            while (x < 10) {
                System.out.print("Q");
                x++;
            }
            System.out.println(" ");
            x = 0;
            y++;
        }

    }
}