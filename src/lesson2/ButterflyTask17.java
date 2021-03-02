/* Создать двухмерный квадратный массив, и заполнить его «бабочкой». */
package lesson2;

public class ButterflyTask17 {
    public static void main(String[] args) {
        int array[][] = new int[11][11];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((j <= array.length - i - 1 && i <= j) || (j >= array.length - i - 1 && i >= j)) {
                    array[i][j] = 1;
                    System.out.print(" " + array[i][j] + " ");
                } else {
                    array[i][j] = 0;
                    System.out.print(" " + array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}