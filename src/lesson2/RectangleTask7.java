/* Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
полностью закрыть круглой картонкой радиусом r. */
public class RectangleTask7 {
    public static void main(String[] args) {
        int lenght = 2;
        int width = 6;
        int radius = 3;
        int squareRectangle = lenght * width;
        double squareCircle = 3.14 * (radius * radius);
        if (squareCircle > squareRectangle) {
            System.out.println("Прямоугольное отверстие можно закрыть круглой картонкой.");
        } else {
            System.out.println("Прямоугольное отверстие нельзя закрыть круглой картонкой.");
        }
    }
}
