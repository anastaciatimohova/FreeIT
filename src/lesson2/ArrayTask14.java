/* Создать массив оценок произвольной длины, вывести максимальную и
минимальную оценку, её (их) номера. */
package lesson2;

import java.util.Arrays;
import java.util.Random;

public class ArrayTask14 {
    public static void main (String[] args){
        Random rand = new Random();
        int array[] = new int[10];
        int max = 0;
        int indexMax = 0;
        int min = 0;
        int indexMin = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(100) + 0;
        }
        System.out.println(Arrays.toString(array));
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
        System.out.println("Максимальная оценка - " + max + ", её индекс - " + indexMax);
        System.out.println("Минимальная оценка - " + min + ", её индекс - " + indexMin);
    }
}
