/* Определите сумму элементов одномерного массива, расположенных между
минимальным и максимальным значениями. */
package lesson2;

import java.util.Arrays;
import java.util.Random;

public class MaxMinArrayTask16 {
    public static void main(String[] args) {
        Random rand = new Random();
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(100) + 0;
        }
        System.out.println("Ваш массив - " + Arrays.toString(array));
        int max = 0;
        int indexMax = 0;
        int min = 0;
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[indexMin] > array[i]) {
                min = array[i];
                indexMin = i;
            }
        }
        int sum = 0;
        if (indexMin < indexMax){
            for (int i = indexMin; i <= indexMax; i++){
                sum = array[i] + sum;
            }
        }else {
            for (int i = indexMax; i <= indexMin; i++) {
                sum = array[i] + sum;
            }
        }
        System.out.println("Сумма элеметов одномерного массива, \nрасположенных между минимальным и максимальным значениями, равна - " + sum);
    }
}
