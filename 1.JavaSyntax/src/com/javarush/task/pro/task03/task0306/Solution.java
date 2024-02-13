package com.javarush.task.pro.task03.task0306;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstSide = Integer.parseInt(reader.readLine());
        int secondSide = Integer.parseInt(reader.readLine());
        int thirdSide = Integer.parseInt(reader.readLine());
        boolean isExists = true;
        if (firstSide >= secondSide + thirdSide) {
            isExists = false;
        } else if (secondSide >= firstSide + thirdSide) {
            isExists = false;
        } else if (thirdSide >= firstSide + secondSide)
            isExists = false;
        System.out.println(isExists == true ? TRIANGLE_EXISTS : TRIANGLE_NOT_EXISTS);
    }
}
