/* Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно создавать
еще один массив). */
package lesson2;

import java.util.Arrays;
import java.util.Random;

public class TurnOverTask15 {
    public static void main(String[] args) {
        Random rand = new Random();
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(100) + 0;
        }
        System.out.println("Ваш массив - " + Arrays.toString(array));
        int j, i;
        for (i = 0, j = array.length - 1; i < j; i++, j--) {
            int last = array[i];
            array[i] = array[j];
            array[j] = last;
        }
            System.out.println("Ваш массив наоборот - " + Arrays.toString(array));
    }
}
