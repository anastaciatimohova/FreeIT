/* Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
произведение, т.е. факториал числа. */
public class FactorialTask9 {
    public static void main(String[] args) {
        long multiply = 1;
        int x = (int)(Math.random() * 20);
        System.out.print("Факториал числа " + x);
        while(x != 0) {
            multiply *= x;
            x--;
        }
        System.out.print(" равен - " + multiply);
    }
}
