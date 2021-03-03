import java.util.Scanner;

/*Создайте число. Определите, является ли число трехзначным. Определите, является
ли его последняя цифра семеркой. Определите, является ли число четным.*/
public class LastNumberTask6 {
    public static void main(String[] args) {
        Scanner scannerNumber = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, ваше число: ");
        int number = scannerNumber.nextInt();
        String numberStr = "" + number;
        if (numberStr.length() == 2) {
            System.out.println("Ваше число является трехзначным.");
        } else {
            System.out.println("Ваше число не является трехзначным.");
    }
        if (number % 10 == 7) {
            System.out.println("Ваше число оканчивается цифрой 7.");
        } else {
            System.out.println("Ваше число не оканчивается цифрой 7.");
        }
        if (number % 2 == 0) {
            System.out.println("Ваше число является четным.");
        } else {
            System.out.println("Ваше число является нечетным.");
        }
    }
}
