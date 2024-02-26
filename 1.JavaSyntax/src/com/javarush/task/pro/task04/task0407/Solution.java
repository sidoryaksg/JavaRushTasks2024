package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int count = 0;
        int result = 0;
        while (count <100){
            count++;
            if (count % 3 == 0){
                //System.out.println(count);

                continue;
            } else
                result = result + count;
        }

        System.out.println(result);


    }
}