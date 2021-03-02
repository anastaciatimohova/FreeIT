/* Дано целое число. Если оно является положительным, то прибавить к нему 1.
Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на 10.
Вывести полученное число. */
package AddLesson2;

public class Task3 {
    public static void main(String[] args){
        int number = -25;
        System.out.println("Исходное число - " + number);
        if(number > 0){
            number += 1;
            System.out.println("Полученное число - " + number);
        }else if(number < 0){
            number -= 2;
            System.out.println("Полученное число - " + number);
        }else if(number == 0){
            number = 10;
            System.out.println("Полученное число - " + number);
        }
    }
}
