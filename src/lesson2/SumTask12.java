/* Найдите сумму первых n целых чисел, которые делятся на 3. */
package lesson2;

import java.util.Scanner;

public class SumTask12 {
    public static void main(String[] args) {
        Scanner scannerNumber = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.println("Введите, пожалуйста, ваше число: ");
            number = scannerNumber.nextInt();
            if (number % 3 == 0) {
                sum += number;
                count++;
            }
            if (count == 3) {
                System.out.println("Сумма первых трёх чисел, которые делятся на 3 равна - " + sum);
                break;
            }
        }
    }
}
