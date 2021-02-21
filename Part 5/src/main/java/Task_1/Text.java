package Task_1;

public abstract class Text {
    private String text;

    public Text() {
    }

    protected Text(String text) {

        this.text = text;
    }

    protected String getText() {
        return text;
    }

    protected void setText(String line) {

        this.text = line;
    }

    abstract protected String addText(String line);
}
