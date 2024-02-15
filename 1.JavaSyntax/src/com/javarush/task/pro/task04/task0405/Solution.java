package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int x = 0;
        int y = 0;

        while (y < 10) {
            while (x < 20) {
                {
                    if (y == 0 || y == 9) {
                        System.out.print("Б");
                    } else if (x == 0 || x == 19) {
                        System.out.print("Б");
                    } else System.out.print(" ");

                }
                x++;
            }
            x = 0;
            y++;
            System.out.println("");
        }
    }


}
