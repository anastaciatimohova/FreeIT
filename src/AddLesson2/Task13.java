/* Напишите программу вывода всех четных чисел от 2 до 100 включительно. */
package AddLesson2;

public class Task13 {
    public static void main(String[] args){
        for(int number = 2; number <= 100; number++){
            if(number % 2 == 0){
                System.out.print(number + " ");
            }
        }
    }
}