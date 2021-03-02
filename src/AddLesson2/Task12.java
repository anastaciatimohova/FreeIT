/* Напишите программу печати таблицы перевода расстояний из дюймов
в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см. */
package AddLesson2;

public class Task12 {
    public static void main(String[] args){
        double sm = 2.54;
        double inch = 1;
        for(int i = 0; i < 20; i++){
            sm *= inch;
            System.out.println("In " + inch + " inch - " + sm + " centimetr.");
            inch ++;
        }
    }
}