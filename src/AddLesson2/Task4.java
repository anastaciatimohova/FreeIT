/* Даны 3 целых числа. Найти количество положительных чисел в исходном наборе. */
package AddLesson2;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args){
        Random rand = new Random();
        int array[] = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = rand.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] > 0){
                count++;
            }
        }
        System.out.println("Количествество положительных чисел равно " + count);
    }
}
