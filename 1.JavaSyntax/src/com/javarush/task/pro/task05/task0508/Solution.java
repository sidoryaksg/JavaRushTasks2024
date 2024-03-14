package com.javarush.task.pro.task05.task0508;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = reader.readLine();

        }

        for (int i = 0; i < strings.length - 1; i++) {
            String rem = null;
            for (int j = i+1; j < strings.length; j++) {
                if ((strings[j] != null && strings[i] != null) && strings[j].equals(strings[i])){
                    rem = strings[j];
                    strings[i] = null;
                    strings[j] = null;

                }
                else if ((rem != null && strings[j] != null) && rem.equals(strings[j])){
                    strings[j] = null;
                }

            }

        }




        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
