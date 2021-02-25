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
        int count = 0;
            while(i < numberStr.length()){
                while(j < numberStr.length()){
                    if (numberStr.charAt(i) == numberStr.charAt(j) && i != j){
                        count++;
                    }
                    j++;
                }
                i++;
                j = 0;
            }
        if (count >0) {
            System.out.println("В вашем числе есть одинаковые числа!");
        } else {
            System.out.println("В вашем числе нет одинаковых чисел!");
        }
    }
}
