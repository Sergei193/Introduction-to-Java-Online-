package Task_1;

public class Task_1_5 {
    //  5.1 Создать объект класса Текстовый файл, используя классы Файл, Директория.
//  Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
    public static void main(String[] args) {
        System.out.println("Has created text file");
        File file_1 = new File("File №1 ");
        System.out.println("Add text in file №1");
        file_1.saveTextFile(file_1.addText("5.1 Создать объект класса Текстовый файл, используя классы Файл, Директория."));

        Directory directory_1 = new Directory("d:");
        System.out.println("Create directory " + directory_1.getDirectoryName());
        directory_1.addFileDirectory(file_1);
        directory_1.addFileDirectory(new File("File №2 "));
        directory_1.addToFile("File №2 ", " Методы: создать, переименовать,");
        directory_1.addToFile("File №2 ", "  вывести на консоль содержимое, дополнить, удалить.");
        System.out.println("Remove File №1 ");
        directory_1.removeFileDirectory("File №1 ");
        System.out.println("Rename directory ");
        directory_1.changeSetDirectoryName("f:");
        directory_1.addToFile("File №2 ", "  Допишем еще раз.......вывести на консоль содержимое, дополнить, удалить.");
        directory_1.printContentFile("File №2");

    }
}
