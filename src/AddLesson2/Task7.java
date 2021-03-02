/* В переменную записываете количество программистов. В зависимости от количества
программистов необходимо вывести правильно окончание. Например: • 2 программиста •
1 программиста • 10 программистов • и т.д. */
package AddLesson2;

import java.util.Random;

public class Task7 {
    public static void main(String[] args){
        Random rand = new Random();
        int prog = Math.abs(rand.nextInt());
        if (prog % 10 == 1) {
            System.out.println(prog + " программист");
        } else if(prog % 10 >= 2 & prog % 10 <= 4) {
            System.out.println(prog + " программиста");
        } else if(prog % 10 > 4 && prog % 100 <= 20) {
            System.out.println(prog + " программистов");
        } else if(prog % 10 == 0) {
            System.out.println(prog + " программистов");
        }
    }
}
