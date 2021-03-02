/* Одноклеточная амеба каждые 3 часа делится на 2 клетки.
Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа. */
package AddLesson2;

public class Task9 {
    public static void main(String[] args){
        int ameba = 1;
        System.out.println("Вначале деления есть " + ameba + " амёба.");
        for(int i = 3; i <= 24; i += 3){
            ameba *= 2;
            System.out.println("Через " + i + "ч - " + ameba + " амёб(ы).");
        }
    }
}
