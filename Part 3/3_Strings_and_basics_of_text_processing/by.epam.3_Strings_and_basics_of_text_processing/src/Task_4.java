import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task_4 {
    //    4.В строке найти количество чисел
    int count = 0;

    public Task_4() {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter line");
            String line = bufferedReader.readLine();
            count = findCountNumbers(line);
            System.out.println("Quantity of number = " + count);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    private int findCountNumbers(String str) throws Exception {

        char[] charStr = str.toCharArray();
        for (int i = 0; i < charStr.length-1; i++) {
            if (isDigits(charStr[i])) {
                if (!isDigits(charStr[i + 1])) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isDigits(char ch) throws Exception {
        boolean isDigit = false;
        char[] digits = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        for (int i = 0; i < digits.length; i++) {
            if (ch == digits[i]) {
                isDigit = true;
            }
        }
        return isDigit;
    }

}
