package Task_1;

import java.util.ArrayList;

public class File extends Text {
    private String nameFile;
    protected StringBuffer stringBufferContentFile;

    public File(String nameFile) {
        super();
        this.nameFile = nameFile;
        //listTextFile = new ArrayList<>();
        stringBufferContentFile = new StringBuffer();
    }

    public String getNameFile() {
        return nameFile;
    }

    @Override
    protected String addText(String line) {
        StringBuffer stringBufferAddText = new StringBuffer();
        if (getText() == null) {
            stringBufferAddText.append(line);
        } else {
            stringBufferAddText.append(getText() + line);
        }
        return stringBufferAddText.toString();
    }

    protected void saveTextFile(String line) {
        stringBufferContentFile.append(line);
        System.out.println("Text in file\n" + stringBufferContentFile.toString());
    }


}
