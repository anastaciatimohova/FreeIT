/* Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
различны? */

import java.util.Scanner;

public class DifferentTask5 {
    public static void main(String[] args) {
        Scanner scannerNumber = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, 4-х значное натуральное число: ");
        int number = scannerNumber.nextInt();
        String numberStr = "" + number;
        int i = 0;
        int j = 0;
        boolean chek = false;
        while (i < numberStr.length()) {
            while (j < numberStr.length()) {
                if (numberStr.charAt(i) == numberStr.charAt(j) && i != j) {
                    chek = true;
                }
                j++;
            }
            i++;
            j = 0;
        }
        if (chek == true) {
            System.out.println("В вашем числе есть одинаковые числа!");
        } else {
            System.out.println("В вашем числе нет одинаковых чисел!");
        }
    }
}
