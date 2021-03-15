import java.util.StringTokenizer;

/* Имеется строка с текстом. Вывести текст, составленный из последних букв
всех слов. */
public class LastLetterTask20 {
    public static void main(String[] args) {
        String str = "Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.";
        StringTokenizer stringToken = new StringTokenizer(str, "\" .,;:!?)('");
        int countLex = stringToken.countTokens();
        String words = "";
        for (int i = 0; i < countLex; i++) {
            words = stringToken.nextToken();
            for (int j = 0; j <= words.length(); j++) {
                if (j == words.length()) {
                    System.out.print(words.charAt(j - 1));
                }
            }
        }
    }
}