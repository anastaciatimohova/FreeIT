/* Начав тренировки, спортсмен в первый день пробежал 10 км.
Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
Какой суммарный путь пробежит спортсмен за 7 дней? */
package AddLesson2;

public class Task8 {
    public static void main(String[] args){
       double magnification = 0.1;
       double distance = 10;
       double road = distance;
       double sum = distance;
      for(int day = 1; day < 7; day++){
          distance *= magnification;
          road += distance;
          distance = road;
          sum += distance;
      }
       System.out.println("Суммарный путь пробежки - " + sum + " км.");
    }
}
