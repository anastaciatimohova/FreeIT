/* Составьте программу, вычисляющую A*B, не пользуясь операцией умножения. */
package AddLesson2;

public class Task11 {
    public static void main(String[] args) {
        int numberA = 384;
        int numberB = 48;
        int multiply = 0;
        if (numberA > numberB) {
            for (int i = 0; i < numberA; i++) {
                multiply += numberB;
            }
        } else {
            for (int i = 0; i < numberB; i++) {
                multiply += numberA;
            }
        }
        System.out.println("Результат умножения - " + multiply);
    }
}
