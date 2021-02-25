/* Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
        А) минут + секунд,
        В) часов + минут + секунд,
        С) дней + часов + минут + секунд,
        D) недель + дней + часов + минут + секунд. */
public class WeekDayHourTask3 {
    public static void main(String[] args) {
        int s = 4500;
        int min = s / 60;
        int sec = s % 60;
        System.out.println("В 4500 секундах содержится: \n " + min + " минут и " + sec + " секунд.");
        int h = min / 60;
        int min1 = min % 60;
        System.out.println(h + " час " + min1 + " минут и " + sec + " секунд.");
        int day = h / 24;
        System.out.println(day + " дней " + h + " час " + min1 + " минут и " + sec + " секунд.");
        int week = day / 7;
        System.out.println(week + " недель " + day + " дней " + h + " час " + min1 + " минут и " + sec + " секунд.");
    }
}
