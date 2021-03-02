/* Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе. */
package AddLesson2;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args){
        Random rand = new Random();
        int array[] = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = rand.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int countPos = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] > 0){
                countPos++;
            }
        }
        System.out.println("Количествество положительных чисел равно " + countPos);
        int countNeg = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] < 0){
                countNeg++;
            }
        }
        System.out.println("Количествество отрицательных чисел равно " + countNeg);
    }
}
