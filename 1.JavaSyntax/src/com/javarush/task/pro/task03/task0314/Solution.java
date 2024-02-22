package com.javarush.task.pro.task03.task0314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        if (line.toLowerCase().equals(secret.toLowerCase()))
        System.out.println("доступ разрешен");
        //напишите тут ваш код
        else
        System.out.println("доступ запрещен");
    }
}
