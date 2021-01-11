package by.epam.introjava.basicsofsoftware;

import java.util.Scanner;
public class main {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an action");
        System.out.println("1.Linear programs");
        System.out.println("2.Branches");
        System.out.println("3.Cycles");
        int chooseBCW;
        while (true){
            try {
System.out.println("Your action is ->");
                switch (chooseBCW = scanner.nextInt()){
                    case 1:
LinearPrograms lP = new LinearPrograms();
lP.linearPrograms();
                        break;
                    case 2:
                        Branches branches = new Branches();
                        break;
                    case 3:
                        Cycles cycles = new Cycles();
                        break;
                    case 0:
                        break;
                }
            }
            catch (Exception e){
                System.out.println("Check data entry! Data are wrong!");
            }
        }




    }
}
