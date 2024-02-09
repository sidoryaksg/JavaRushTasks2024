package com.javarush.task.pro.task03.task0305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstInt = Integer.parseInt(reader.readLine());
        int secondInt = Integer.parseInt(reader.readLine());
        int thirdInt = Integer.parseInt(reader.readLine());

        if ((firstInt == secondInt) && (secondInt == thirdInt)) {
            System.out.println(firstInt + " " + secondInt + " " + thirdInt);

        } else if ((firstInt == secondInt)) {
            System.out.println(firstInt + " " + secondInt);
        } else if (firstInt == thirdInt) {
            System.out.println(firstInt + " " + thirdInt);
        } else if (secondInt == thirdInt) {
            System.out.println(secondInt + " " + thirdInt);
        }


    }
}
