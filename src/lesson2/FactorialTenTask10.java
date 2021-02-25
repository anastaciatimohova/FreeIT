/* Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию). */
public class FactorialTenTask10 {
    public static void main(String[] args) {
        long multiplay = 1;
        int x = (int)(Math.random() * (16 - 10) + 10);
        System.out.print("Факториал числа " + x);
        while(x != 0) {
            multiplay *= x;
            x--;
        }
        System.out.print(" равен - " + multiplay);
    }
}
