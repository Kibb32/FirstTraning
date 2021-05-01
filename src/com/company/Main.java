package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final double STEPS_IN_SPAM = 10;
        final double SPANS_IN_FLOOR = 2;

        double floor, LiveInStep;
        double result;

        Scanner input = new Scanner(System.in);

        System.out.println("Эта программа расчитывает солько вы получите доп. секунд жизни,поднявшись на определённный этаж");

        System.out.print("Введите этаж, на который вы хотите взобраться: ");
        floor = input.nextDouble();

        System.out.print("Сколько секунд дает одна ступенька: ");
        LiveInStep = input.nextDouble();

        result = LiveInStep * STEPS_IN_SPAM * SPANS_IN_FLOOR * floor;
        System.out.println("Ваша жизнь увеличилась на: " + result + " сек ");
        //juck

    }
}
