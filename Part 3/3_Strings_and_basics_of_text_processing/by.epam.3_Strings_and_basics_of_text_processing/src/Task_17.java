import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_17 {
    //        17 (2)  Напишите анализатор, позволяющий последовательно возвращать содержимое узлов
//        xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега,
//                тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
    String xml = "<notes>\n" +
            "    <note id = \"1\">\n" +
            "        <to>Вася</to>\n" +
            "        <from>Света</from>\n" +
            "        <heading>Напоминание</heading>\n" +
            "        <body>Позвони мне завтра!</body>\n" +
            "    </note>\n" +
            "    <note id = \"2\">\n" +
            "        <to>Петя</to>\n" +
            "        <from>Маша</from>\n" +
            "        <heading>Важное напоминание</heading>\n" +
            "        <body/>\n" +
            "    </note>\n" +
            " </notes> \n";

    public Task_17() {
        try {
            String xmlAnalisaion = xmlAnalization(xml);
            System.out.println(xmlAnalisaion);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String xmlAnalization(String xml) throws Exception {
        StringBuffer stringBuffer = new StringBuffer();
        Pattern patternOpen = Pattern.compile("<\\w.+?>");
        Pattern patternClose = Pattern.compile("</\\w+>>");
        Pattern patternBody = Pattern.compile(">.*<");
        Pattern patternEmpty = Pattern.compile("<\\w.+?/>");

        String[] line = xml.split("\n\\s*");
        for (int i = 0; i < line.length; i++) {
            Matcher matcherOpen = patternOpen.matcher(line[i]);
            Matcher matcherClose = patternClose.matcher(line[i]);
            Matcher matcherBody = patternBody.matcher(line[i]);
            Matcher matcherEmpty = patternEmpty.matcher(line[i]);

            if (matcherOpen.find()) {
                stringBuffer.append(matcherOpen.group() + " - tag open\n ");
            }
            if (matcherClose.find()) {
                stringBuffer.append(matcherClose.group() + " - tag close\n ");
            }
            if (matcherBody.find()) {
                stringBuffer.append(matcherBody.group() + " - content of tag \n ");

            }
            if (matcherEmpty.find()) {
                stringBuffer.append(matcherEmpty.group() + " - tag is empty\n ");
            }
        }

        return stringBuffer.toString();
    }

}
