public class Task_14 {
    //        14 (9). Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке
    String line = "vbnvnDDFFbTYYTvbnvnbcf bvbnvGGHJHJJJJJJJJJJJJJ  JJJCFJCJFbmbnmnbmnbmmbbnmbm";

    public Task_14() {
        try {
            countSymbol(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void countSymbol(String line) throws Exception {
        int lowerCase = 0, upperCase = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isUpperCase(line.charAt(i))) {
                upperCase++;
            } else if (Character.isLowerCase(line.charAt(i))) {
                lowerCase++;
            }
        }
        System.out.println("The letters in upper case = " + upperCase + "\nThe letters in lower  case = " + lowerCase);

    }


}
//for (int k = 0; k < input.length(); k++) {
//        if (Character.isUpperCase(input.charAt(k))) upperCase++;
//        if (Character.isLowerCase(input.charAt(k))) lowerCase++;
//        }
//        System.out.printf("Всего %d заглавных букв и %d прописных.",upperCase,lowerCase);