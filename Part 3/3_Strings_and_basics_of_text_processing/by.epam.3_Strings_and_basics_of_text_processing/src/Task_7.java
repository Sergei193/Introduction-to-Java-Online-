import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task_7 {
    //        7 (2). В строке вставить после каждого символа 'a' символ 'b'.

    public Task_7() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter line");
            //String line = bufferedReader.readLine();
            char a, b;
            String line = "vcnvmavnvmajhajhgj";
            System.out.println("Line = " + insertSymbol('a', 'b', line));
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    private String insertSymbol(char a, char b, String line) {
        String newLine;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'a') {
                stringBuffer.append("ab");
            } else {
                stringBuffer.append(line.charAt(i));
            }
        }
        newLine = stringBuffer.toString();
        return newLine;
    }
}
