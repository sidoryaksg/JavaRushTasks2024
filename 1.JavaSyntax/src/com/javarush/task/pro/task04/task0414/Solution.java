package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int number = 0;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        }
        if (number > 0 && number < 5){
            int i = 0;
            do{
                System.out.println(line);
                i++;
            } while (i<number);
        } else
            System.out.println(line);


    }
}