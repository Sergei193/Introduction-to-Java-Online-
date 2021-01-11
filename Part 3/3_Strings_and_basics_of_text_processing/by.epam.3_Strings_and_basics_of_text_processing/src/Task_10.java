import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_10 {
    //    10 (5).Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
    public Task_10() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter line");
            String line = bufferedReader.readLine();
            int quantity = qualityMeetA(line);
            System.out.println("The letter A has met " + quantity + " times");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int qualityMeetA(String line) throws Exception {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'a') {
                count++;
            }
        }

        return count;
    }

}
