package ru.geekbrains.lesson1;

import javax.xml.bind.SchemaOutputResolver;

public class JavaApp {

    public static void main(String[] args) { //Задание №1

      //Задание №2
        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 40;
        float e = 10.32f;
        double f = 3.14;
        char symbol = 'a';
        boolean isTrue = true;

        System.out.println(calculate(20.35f, 31.28f, 45.82f, 67.95f)); //Задание №3
        System.out.println(task10and20(10, 5)); //Задание №4
        isPositiveOrNegative(5); //Задание №5
        System.out.println(isNegative(-1)); //Задание №6
        hello("GeekBrains"); //Задание №7
        leapYear(2021); //Задание №8
    }

    public static float calculate(float a, float b, float c, float d){
        float calc = a * (b + (c / d));
        return calc;
    }

    public static boolean task10and20(int x1, int x2){
        if ((x1 + x2) >= 10 && (x1 + x2) <= 20)
            return true;
        else
            return  false;
    }

    public static void isPositiveOrNegative(int x){
        if (x >= 0)
            System.out.println(x + " - это положительное число");
        else
            System.out.println(x + " - это отрицательное число");
    }

    public static boolean isNegative(int x){
        if (x < 0)
            return true;
        else
            return false;
    }

    public static void hello(String name){
        System.out.println("Привет, " + name + "!");
    }

    public static void leapYear(int year) {
        int leap = 4; //каждый 4-й год - високосный

        if ((year % leap) == 0 && (year % 400) == 0)
            System.out.println("год високосный");
        else
            System.out.println("год не високосный");

    }
}
