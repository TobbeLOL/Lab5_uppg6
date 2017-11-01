import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set uniqueSet = new LinkedHashSet();
        boolean notBored = true;

        while (notBored) {
            String input = sc.next();
            uniqueSet.add(input);
            System.out.println(uniqueSet.size());

            if (uniqueSet.size() > 5) {
                notBored = false;
            }
        }
        uniqueSet.forEach(System.out::println);
    }
}
