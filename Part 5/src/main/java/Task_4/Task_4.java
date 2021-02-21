package Task_4;

public class Task_4 {
    //    5.4 Создать консольное приложение, удовлетворяющее следующим требованиям:
//            • Приложение должно быть объектно-, а не процедурно-ориентированным.
// • Каждый класс должен иметь отражающее смысл название и информативный состав.
//             • Наследование должно применяться только тогда, когда это имеет смысл.
//           • При кодировании должны быть использованы соглашения об оформлении кода java code convention.
//          • Классы должны быть грамотно разложены по пакетам.
//• Консольное меню должно быть минимальным.
// • Для хранения данных можно использовать файлы.
//            Дракон и его сокровища.  Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
// дракона.  Реализовать  возможность  просмотра  сокровищ,  выбора  самого  дорогого  по  стоимости  сокровища  и
//выбора сокровищ на заданную сумму.
    public static void main(String[] args) {


        Dragon dragon_1 = new Dragon(1, "Dragon № 1");
        dragon_1.cave_1.addJewelsList(dragon_1.cave_1.createJewelsCave());
        dragon_1.listCaveDragon.add(dragon_1.cave_1);
        System.out.println(dragon_1.toString() + " has in cave " + dragon_1.cave_1.getCaveID() + " following  jewels");
        dragon_1.cave_1.printListJewelsCave();
        System.out.println("The most expencive jewel " + dragon_1.cave_1.findMostExpensiveJewel().toString());
        dragon_1.cave_1.sortedJewelCaveAscending();
        int countJewels = 4;// (int) ((Math.random() * 10) + 1);
        int summa = 50;//(int) ((Math.random() * 100) + 1);
        dragon_1.cave_1.buyJewels(countJewels, summa);
        dragon_1.cave_1.writeJewelsFile();
        System.out.println(" Jewels that are in File");
        dragon_1.cave_1.readJewelsFile();


    }


}
