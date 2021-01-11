import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task_11 {
    //      11.(6) Из заданной строки получить новую, повторив каждый символ дважды.
    public Task_11() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter line");
            String line = bufferedReader.readLine();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                stringBuilder.append(line.charAt(i)).append(line.charAt(i));
            }
            System.out.println("New line " + stringBuilder.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
