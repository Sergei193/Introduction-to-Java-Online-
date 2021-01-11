public class Task_12 {
    //       12 (7) Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
//                Например, если было введено "abc cde def", то должно быть выведено "abcdef".
    String line = "abc cde def";
    String newLine;

    public Task_12() {
        try {
            System.out.println("Old line - > " + line);
            newLine = removeSymbols(line);
            System.out.println("New line - >" + newLine);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private String removeSymbols(String line) throws Exception {

        StringBuilder stringBuilder = new StringBuilder(line);//|| line.charAt(i) == line.charAt(i + 1)

        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == ' ') {
                stringBuilder.deleteCharAt(i);
            }
            for (int j = i + 1; j < stringBuilder.length(); j++) {
                if (stringBuilder.charAt(i) == stringBuilder.charAt(j)) {
                    stringBuilder.deleteCharAt(i);
                }
            }
        }
//        for (int i = 0; i < stringBuilder.length() - 1; i++) {
//            if (stringBuilder.charAt(i) == ' ' || stringBuilder.charAt(i) == stringBuilder.charAt(i)) {
//                stringBuilder.deleteCharAt(i);
//            }
//        }
        return stringBuilder.toString();
    }
}
