import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = ("1- укдяр2оп оп 3алсич4 ына5сип6ан7 ьсе8дз9");
        Pattern pattern = Pattern.compile("\\d+");
        Pattern pattern1 = Pattern.compile("\\D+");
        Matcher matcher = pattern.matcher(text);
        Matcher matcher1 = pattern1.matcher(text);

        String result = (matcher.replaceAll(""));
        StringBuilder stringBuilder = new StringBuilder(result);

        System.out.println(stringBuilder.reverse() + " " + matcher1.replaceAll("") );
        System.out.println("xoxoxo");

    }
}