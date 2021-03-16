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
        System.out.println("В " + s + " секундах содержится: \n" + min + " минут(ы) и " + sec + " секунд(ы).");
        int h = min / 60;
        int min1 = min % 60;
        System.out.println(h + " час(а) " + min1 + " минут(ы) и " + sec + " секунд(ы).");
        int day = h / 24;
        int h1 = h % 24;
        System.out.println(day + " дня(ей) " + h1 + " час(а) " + min1 + " минут(а) и " + sec + " секунд(ы).");
        int week = day / 7;
        int day1 = day % 7;
        System.out.println(week + " недель(и) " + day + " дня(ей) " + h1 + " час(а) " + min1 + " минут(ы) и " + sec + " секунд(ы).");
    }
}