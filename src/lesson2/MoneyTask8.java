/*
 * Имеется целое число (задать с помощью Random rand = new Random(); int x =
 * rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
 * нему слово «рублей» в правильном падеже.
 */
import  java.util.Random;
import  java.lang.Math;
public class MoneyTask8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int money = Math.abs(rand.nextInt());
        if (money % 10 == 1) {
            System.out.println(money + " рубль");
        } else if(money % 10 == 2) {
            System.out.println(money + " рубля");
        } else if(money % 10 == 3) {
            System.out.println(money + " рубля");
        } else if(money % 10 == 4) {
            System.out.println(money + " рубля");
        } else if(money % 10 == 5) {
            System.out.println(money + " рублей");
        } else if(money % 10 == 6) {
            System.out.println(money + " рублей");
        } else if(money % 10 == 7) {
            System.out.println(money + " рублей");
        } else if(money % 10 == 8) {
            System.out.println(money + " рублей");
        } else if(money % 10 == 9) {
            System.out.println(money + " рублей");
        } else if(money % 10 == 0) {
            System.out.println(money + " рублей");
        }
    }
}