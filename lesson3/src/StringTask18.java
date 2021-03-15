/* Найти в строке не только запятые, но и другие знаки препинания.
Подсчитать общее их количество. */
public class StringTask18 {
    public static void main(String[] args) {
        String str = " Понадобится мое мнение - я скажу: настоящий друг (именно друг, а не просто приятель) познается в радости; умение радоваться за другого - редкое качество, очень редкое в наши дни! ";
        int n = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ',' || symbol == '.' || symbol == '-' || symbol == '—' || symbol == ';' || symbol == ':' || symbol == '"' || symbol == '!' || symbol == '?' || symbol == ')' || symbol == '(') {
                n++;
            }
        }
        System.out.println("В вашей строке " + n + " знака(ов) препинания.");
    }
}
