package com.javarush.task.pro.task02.task0215;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstInt = Integer.parseInt(reader.readLine());
        int secondInt = Integer.parseInt(reader.readLine());
        int thirdInt = Integer.parseInt(reader.readLine());
        System.out.println((firstInt+secondInt+thirdInt)/3);

    }
}
