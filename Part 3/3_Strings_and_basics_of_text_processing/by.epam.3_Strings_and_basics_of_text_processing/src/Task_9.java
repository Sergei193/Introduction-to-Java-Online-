public class Task_9 {
//    9 (4). С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

    public Task_9() {
        try {
            String str = "информатика";
            String str_1 = str.substring(7, 8);
            String str_2 = str.substring(3, 5);
            String str_3 = str_1.concat(str_2) + str_1;
            System.out.println("New line " + str_3);

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

}
