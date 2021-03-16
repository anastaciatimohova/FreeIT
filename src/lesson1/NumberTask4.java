import java.util.Scanner;

/* Определить число, полученное выписыванием в обратном порядке цифр
любого 4-х значного натурального числа n. */
public class NumberTask4 {
    public static void main(String[] args) {
        Scanner scannerNumber = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, 4-х значное натуральное число: ");
        int number = scannerNumber.nextInt();
        String numberStr = "" + number;
        System.out.println("Ваше число в обратном порядке: ");
        for(int i = numberStr.length() - 1; i >= 0; i--)
        System.out.print(numberStr.charAt(i));
    }
}