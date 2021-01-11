import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task_3 {
//    3.В строке найти количество цифр


    public Task_3() {
        System.out.println("Enter line with digits");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = bufferedReader.readLine();
            findDigits(line);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    private void findDigits(String str) {
        char[] digits = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < digits.length; j++) {
                if (str.charAt(i) == digits[j]) {
                    counter++;
                }
            }
        }
        System.out.println("Count of digits in line = " + counter);
    }
}
