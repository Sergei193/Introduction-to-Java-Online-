import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task_5 {
    //5.    Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//       Крайние пробелы в строке удалить.

    public Task_5() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter line ");
            String line = bufferedReader.readLine();
            System.out.println("New line " + changeSpace(line));


        } catch (Exception e) {
            System.err.println(e.toString());
        }

    }

    private String changeSpace(String str) throws Exception {
        String newStr;
        str.trim();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ') {
                if (str.charAt(i + 1) != ' ') {
                    stringBuffer.append(" ");
                }
            } else {
                stringBuffer.append(str.charAt(i));
            }
        }
        newStr = stringBuffer.toString();
        return newStr;
    }
}
