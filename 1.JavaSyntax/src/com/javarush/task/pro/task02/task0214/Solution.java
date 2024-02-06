package com.javarush.task.pro.task02.task0214;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str1 = "";
        String str2 = "";
        String str3 = "";
        str1 = reader.readLine();
        str2 = reader.readLine();
        str3 = reader.readLine();
        reader.close();
        System.out.println(str3);
        System.out.println(str2.toUpperCase());
        System.out.println(str1.toLowerCase());

    }
}
