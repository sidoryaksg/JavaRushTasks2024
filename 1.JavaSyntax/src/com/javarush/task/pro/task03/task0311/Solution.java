package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner (System.in);
        Double firstDouble = (double) 0;
        Double secondDouble = (double)0;
        if (scanner.hasNextDouble()){
            firstDouble = scanner.nextDouble();
        }
        if (scanner.hasNextDouble()){
            secondDouble = scanner.nextDouble();
        }
        if (Math.abs(firstDouble - secondDouble) <= 0.000001)
        System.out.println("числа равны");
        //напишите тут ваш код
        else
        System.out.println("числа не равны");
    }
}
