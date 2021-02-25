package lesson2;

/* Имеется целое число, определить является ли это число простым, т.е.
делится без остатка только на 1 и себя. */

import java.util.Scanner;

public class SimpleNumberTask11 {
    public static void main(String[] args) {
        Scanner scannerNumber = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, ваше число: ");
        int number = scannerNumber.nextInt();
        int i = 1;
        int count = 0;
        while(i <= number){
            if(number % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 2 || number == 1) {
            System.out.println("Ваше число является простым.");
        } else {
            System.out.println("Ваше число не является простым.");
        }
    }
}
