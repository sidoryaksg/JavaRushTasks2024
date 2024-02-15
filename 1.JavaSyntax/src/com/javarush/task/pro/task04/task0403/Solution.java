package com.javarush.task.pro.task04.task0403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int summ = 0;
        while ( !(line = reader.readLine()).equals("ENTER")){
            try {
                Integer.parseInt(line);
                summ = summ + Integer.parseInt(line);
            } catch (NumberFormatException e){
                System.out.println("Error parsing");
            }
        }
        System.out.println(summ);


    }
}