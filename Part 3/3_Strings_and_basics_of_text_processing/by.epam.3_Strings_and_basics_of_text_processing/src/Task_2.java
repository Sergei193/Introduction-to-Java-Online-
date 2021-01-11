public class Task_2 {
    //    2.Заменить в строке все вхождения word на letter
    String word = "Hello word!!!,helllo helllo word";

    public Task_2() {
        String wordLetter = wordExchange(word);
        System.out.println(wordLetter);
    }

    private String wordExchange(String word) {
        StringBuffer stringBuffer = new StringBuffer();
        String letter;
        for (int i = 0; i < word.length(); i++) {
            if (i + 3 < word.length() && word.charAt(i) == 'w'
                    && word.charAt(i + 1) == 'o' && word.charAt(i + 2) == 'r'
                    && word.charAt(i + 3) == 'd') {
                stringBuffer.append("letter");
                i += 3;
            } else {
                stringBuffer.append(word.charAt(i));
            }
        }
        letter = stringBuffer.toString();
        return letter;
    }
}
