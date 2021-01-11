import java.util.Arrays;

public class Task_1 {
    //    1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
    String[] snakeCaseArray;

    public Task_1() {
        try {
            String[] camelCase = {"camelCaseone", "camelCasetwo", "camelCasethree"};
            snakeCaseArray = new String[camelCase.length * 2];
            snakeCaseArray = toSnakeCase(camelCase);
            printArray(snakeCaseArray);

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    private String[] toSnakeCase(String[] camelCase) throws Exception {

//        for (int i = 0; i < camelCase.length; i++) {
//            snakeCaseArray[i] = camelCase[i].replace("camel", "snake_");
//            snakeCaseArray[i] = snakeCaseArray[i].toLowerCase();
//        }
        StringBuffer stringBuffer = new StringBuffer();
        String[] snakeCase = new String[camelCase.length * 2];
        for (int j = 0; j < camelCase.length; j++) {
            for (int i = 0; i < camelCase[i].length(); i++) {
                camelCase[i].toCharArray();
                if (camelCase[i].charAt(0) == 'c'
                        && camelCase[i].charAt(1) == 'a' && camelCase[i].charAt(2) == 'm'
                        && camelCase[i].charAt(3) == 'e' && camelCase[i].charAt(4) == 'l') {
                    stringBuffer.append("snake_" + camelCase[i + 4].charAt(i + 4));
                } else {
                    stringBuffer.append(camelCase[i].charAt(i));
                }

            }
            snakeCase[j] = stringBuffer.toString();
        }
        return snakeCase;
    }

    private void printArray(String[] strings) throws Exception {
        for (String str : strings) {
            System.out.println(str);
        }
    }
}