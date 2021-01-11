import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task_8 {
    //        8 (3) . Проверить является ли заданное слово палиндромом
    public Task_8() {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            System.out.println("This word is palindrome ");
            System.out.println(palindrome(line));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean palindrome(String strings) throws Exception {
        int n = strings.length();
        for (int i = 0; i < (n / 2); i++) {
            if (strings.charAt(i) != strings.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
