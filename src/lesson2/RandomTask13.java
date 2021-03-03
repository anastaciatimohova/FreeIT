package lesson2;

import java.util.Arrays;
import java.util.Random;

/* Создать последовательность случайных чисел, найти и вывести наибольшее
из них. */
public class RandomTask13 {
    public static void main(String[] args) {
        Random rand = new Random();
        int array[] = new int[10];
        int max = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(100) + 0;
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное число в массиве - " + max);
    }
}
