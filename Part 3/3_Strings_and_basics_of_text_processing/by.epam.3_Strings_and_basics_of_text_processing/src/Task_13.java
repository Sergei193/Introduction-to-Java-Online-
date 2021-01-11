public class Task_13 {
    //        13 (8). Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести
//        его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.
    int maxCountLetters = 0;
    String line = "letter friendShip solution quince";
    String biggestWord;

    public Task_13() {
        try {
            System.out.println("Given line - > " + line);
            maxCountLetters = findLongerWord(line);
            System.out.println("The longest word is " + biggestWord + " consist from " + maxCountLetters + " letters");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int findLongerWord(String line) throws Exception {
        String[] word = line.split(" ");
        int countLet = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > countLet) {
                countLet = word[i].length();
                biggestWord = word[i];
            }
        }
        return countLet;
    }
}
