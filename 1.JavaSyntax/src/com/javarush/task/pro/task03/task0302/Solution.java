package com.javarush.task.pro.task03.task0302;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String militaryCommissar = ", явитесь в военкомат";
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if (age>=18 && age <=28) {
            System.out.println(name + militaryCommissar);
        }
    }
}
