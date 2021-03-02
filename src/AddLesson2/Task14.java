/* Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99. */
package AddLesson2;

public class Task14 {
    public static void main(String[] args){
        int sum = 0;
        for(int number = 0; number <= 99; number++){
            if(number % 2 > 0){
                sum += number;
            }
        }
        System.out.print("Сумма всех нечетных чисел равна - " + sum);
    }
}

