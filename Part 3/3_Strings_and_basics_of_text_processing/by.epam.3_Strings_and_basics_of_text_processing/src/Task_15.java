public class Task_15 {
    //            15 (10) Строка х состоит из нескольких предложений, каждое из которых кончается точкой,
//    восклицательным или вопросительным знаком. Определить количество предложений в строке X.
    String lineX = " A string x consisting of several sentences. Each of which ends with a dot,exclamation mark or question mark! Determine the number of sentences in line X?";// 3 (. ! ?)

    public Task_15() {
        String[] sentence = lineX.split("[.!?]");
        System.out.println("Numbers of sentences are " + sentence.length);
    }
}
