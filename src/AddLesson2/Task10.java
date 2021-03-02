/* Вычислить: 1+2+4+8+...+256. */
package AddLesson2;

public class Task10 {
    public static void main(String[] args){
        int number = 1;
        int sum = number;
        for(int i = 1; i <256; i *= 2){
            number *= 2;
            sum += number;
        }
        System.out.println("Сумма элементов равна - " + sum);
    }
}
