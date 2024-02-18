package com.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int quarter = 0;
        int x = 0;
        int y = 0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            x = scanner.nextInt();
        }
        if (scanner.hasNextInt()) {
            y = scanner.nextInt();
        }
        if (x > 0) {
            if (y > 0) {
                quarter = 1;
            } else quarter = 4;
        } else if (y < 0) {
            quarter = 3;
        } else quarter = 2;

        System.out.println(quarter);


    }
}
