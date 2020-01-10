import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String string=scanner.nextLine();

        final Pattern pattern = Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]+\\b");
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.print( matcher.group()+" ");

        }

    }
}
