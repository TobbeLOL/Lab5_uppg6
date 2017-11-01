import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        Deque<Character> stack = new ArrayDeque<>();
        String javaClass = "C:\\Users\\Elev1\\IdeaProjects\\Lab5_uppg6\\src\\Unique.java";
        InputStream in = new FileInputStream(javaClass);
        Reader reader = new InputStreamReader(in, Charset.defaultCharset());

        char openParantes = '(';
        char closingParantes = ')';
        char openWing = '{';
        char closingWing = '}';
        char openBracket = '[';
        char closingBracket = ']';




        // LAST IN FIRST OUT
        int r;
        char previousSymbol;

        while ((r = reader.read()) != -1) {
            char findSymbol = (char) r;
            if (findSymbol == openParantes || findSymbol == openWing || findSymbol == openBracket
                    || findSymbol == closingParantes || findSymbol == closingWing || findSymbol == closingBracket) {
                stack.add(findSymbol);
            }
        }

        for (char character : stack) {
            if (character == openParantes) {

            }
        }

        stack.forEach(System.out::println);
        System.out.println("Peek-a-boo " + stack.peek());
        System.out.println("Last: "+ stack.getLast());
    }
}
