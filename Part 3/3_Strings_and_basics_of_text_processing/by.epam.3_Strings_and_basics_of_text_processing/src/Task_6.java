import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task_6 {
    //        6 (1) Дан текст. Найти наибольшее количество идущих продряд пробелов в нём.
    String line = "fkgkg   jhjhj     kjljkl";

    public Task_6() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter line ");
            // line = bufferedReader.readLine();
            int maxSp = countSpaces(line);
            System.out.println("The largest numbers of running spaces = " + maxSp);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private int countSpaces(String line) throws Exception {
        int count = 0;
        int maxSpaces = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                count++;
            } else if (line.charAt(i) != ' ') {
                if ((count > maxSpaces)) {
                    maxSpaces = count;
                }
                count = 0;
            }

        }

        return maxSpaces;
    }
}
