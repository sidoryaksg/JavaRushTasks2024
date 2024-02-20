package com.javarush.task.pro.task03.task0312;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line1 = reader.readLine();
        String line2 = reader.readLine();
        if (line1.equals(line2)) {
            System.out.println("строки одинаковые");
        } else {
            System.out.println("строки разные");
        }//напишите тут ваш код
    }
}
