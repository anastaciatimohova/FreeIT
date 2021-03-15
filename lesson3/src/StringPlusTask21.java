/* Напишите три цикла выполняющих многократное сложение строк, один с
помощью оператора сложения и String, другой с помощью StringBuilder и метода
append, а также аналогино для StringBuffer. Сравните скорость их выполнения. */
public class StringPlusTask21 {
    public static void main(String[] args) {
        String str = "Напишите три цикла";
        String manyStr = "";
        for (int i = 0; i <= str.length(); i++) {
            manyStr += str;
        }
        System.out.println(manyStr);
        //1,653 sec
        StringBuilder strBui = new StringBuilder();
        for (int i = 0; i <= str.length(); i++) {
            strBui.append(str);
        }
        System.out.println(strBui);
        //1,550 sec
        StringBuffer strBuf = new StringBuffer();
        for (int i = 0; i <= str.length(); i++) {
            strBuf.append(str);
        }
        System.out.println(strBuf);
        //1,538 sec
    }
}