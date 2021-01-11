import java.util.regex.Pattern;

public class Task_16 {
//        16 (1). Создать приложение, разбивающее текст (текст хранится в строке) и позволяющее выполнять
//    с текстом три различные операции:
//    отсортировать обзацы по количеству предложений;
//    в каждом предложении отсортировать слова по длине;
//    отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
//    а в случае равенства - по алфавиту.

    String expression = "Create an application that breaks up text (the text is stored in a string) and allows." +
            "   \n There are three different operations with text." +
            "    \nSort the paragraphs by the number of sentences." +
            "    \n Sort words by length in each sentence." +
            "    \nSort tokens in a sentence in descending order of the number of occurrences of a given character,and in case of equality, alphabetically.";

    public Task_16() {
        try {
            sortParagraph(expression);
            System.out.println(expression);
            System.out.println("====================================");
            System.out.println("Sort paragraphs by the amount of sentences:\n");
            String sortedParagraph = sortParagraph(expression);
            System.out.println(sortedParagraph);
            System.out.println("====================================");
            System.out.println("Sort words by the amount of letters:\n");
            String sortedWords = sortSentence(sortedParagraph);
            System.out.println(sortedWords);
            System.out.println("====================================");
            char occur = 't';
            System.out.println("Sort words by the amount of character '" + occur + "' occurrences:\n");
            String sortedByOccurrences = sortByOccurrence(sortedParagraph, occur);
            System.out.println(sortedByOccurrences);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private String sortParagraph(String str) {

        String[] strArray = str.split("\n");

        String[] sortedArray = bubbleSort(strArray);

        String sortedParagraph = toStringParagraph(sortedArray);

        return sortedParagraph;
    }

    private String sortByOccurrence(String str, char ch) {

        String[] strArray = str.split("(\n)");

        for (int i = 0; i < strArray.length; i++) {
            String[] wordsArray = strArray[i].split("[\\s+,.]");

            String[] sortedWordsArray = occurrenceSort(wordsArray, ch);
            String sortedWords = toStringSentence(sortedWordsArray);
            strArray[i] = sortedWords;
        }
        String sorted = toStringParagraph(strArray);

        return sorted;
    }

    private String sortSentence(String str) {

        String[] strArray = str.split("(\n)");

        for (int i = 0; i < strArray.length; i++) {
            String[] wordsArray = strArray[i].split("[\\s+,.]");

            String[] sortedWordsArray = bubbleSort(wordsArray);
            String sortedWords = toStringSentence(sortedWordsArray);
            strArray[i] = sortedWords;
        }
        String sorted = toStringParagraph(strArray);

        return sorted;
    }

    private String toStringSentence(String[] strArray) {

        String str = "";

        for (int i = 0; i < strArray.length; i++) {
            str += strArray[i];
            str += " ";
        }

        return str;

    }

    private String toStringParagraph(String[] strArray) {

        String str = "";

        for (int i = 0; i < strArray.length; i++) {
            str += strArray[i];
            str += " \n";
        }

        return str;

    }

    private String[] occurrenceSort(String[] str, char ch) {

        char chLoweCase = Character.toLowerCase(ch);

        for (int i = 1; i < str.length; i++) {

            String word = str[i].toLowerCase();
            String wordPrevious = str[i - 1].toLowerCase();

            if (isFirst(word.toCharArray(), wordPrevious.toCharArray(), chLoweCase)) {
                String temp = str[i];
                str[i] = str[i - 1];
                str[i - 1] = temp;
                i -= 2;
                if (i < 0) {
                    i = 0;
                }
            }
        }

        return str;
    }

    private boolean isFirst(char[] word, char[] wordPrevious, char ch) {

        int countWord = 0;
        int countWordPrevious = 0;

        for (char letter : word) {
            if (ch == letter) {
                countWord++;
            }
        }

        for (char letter : wordPrevious) {
            if (ch == letter) {
                countWordPrevious++;
            }
        }

        if (countWord == countWordPrevious) {
            return isAlphabeticallyFirst(word, wordPrevious);
        }

        return countWord > countWordPrevious;
    }

    private boolean isAlphabeticallyFirst(char[] word, char[] wordPrevious) {

        int length = word.length < wordPrevious.length ? word.length : wordPrevious.length;

        if (word.length == 0) {
            return false;
        } else if (wordPrevious.length == 0) {
            return true;
        }

        for (int i = 0; i < length; i++) {

            if (word[i] > wordPrevious[i]) {
                return false;
            } else if (word[i] < wordPrevious[i]) {
                return true;
            }
        }

        return word.length < wordPrevious.length;
    }

    private String[] bubbleSort(String[] str) {

        boolean quit = false;

        while (!quit) {

            quit = true;

            for (int i = 0; i < str.length - 1; i++) {

                if (str[i].length() < str[i + 1].length()) {
                    String temp = str[i];
                    str[i] = str[i + 1];
                    str[i + 1] = temp;
                    quit = false;
                }
            }
        }

        return str;
    }
}
