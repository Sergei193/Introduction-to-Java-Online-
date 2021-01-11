package by.epam.introjava.basicsofsoftware;
import java.util.Random;
import java.util.Scanner;

//         ////////5. Вычислить значение функции
//         Scanner scanner = new Scanner(System.in);
//         double x,f= 0;
//         System.out.println(" Enter value X - >");
//         x = scanner.nextDouble();
//         if(x<=3){
//           f = Math.pow(x,2) - 3*x +9;
//         }
//         else if (x>3){
//          f= 1/(Math.pow(x,3) +6 );
//         }
//System.out.println(" F - >" + f);
public class Branches {
    Scanner brchScaner = new Scanner(System.in);
    Random bnchrandom = new Random();
    public Branches(){
task_1();
task_2();
task_3();
task_4();
    }

    private void task_1 (){
        int a,b = 0;
        try {
            a = bnchrandom.nextInt(100 - 10);
            b = bnchrandom.nextInt(100 - 10);
            System.out.println("a = " + a + " b = " + b);
            if ( (a+b) < 180)
            {
                System.out.println("Triangle is exist!!!");
                if(a == 90 || b == 90 || (270 - (a+b)) == 90){
                   System.out.println("Rectangular triangle");
                }
                else {
                    System.out.println("Triangle is not rectangular");
                }
            }
            else {
                System.out.println("Triangle is not exist!!!");
            }
        }
        catch (Exception e) {
            System.out.println("Error task 1 Branches!!!");
        }

    }
    private void task_2(){
        int min1, min2, max = 0;
        int a = bnchrandom.nextInt(100-10);
        int b = bnchrandom.nextInt(100-10);
        int c = bnchrandom.nextInt(100-10);
        int d = bnchrandom.nextInt(100-10);
        System.out.println(" a = " + a + " b = " + b + " c = " + c + " d = " + d);
        if (a < b) {
            min1 = a;
        }
        else {
            min1 = b;
        }
        System.out.println(" min 1 = " + min1);
        if (c < d ) {
            min2 = c;
        }
        else {
            min2 = d;
        }
        System.out.println(" min 2 = " + min2);
        if (min1 > min2) {
            max = min1;
        }
        else {
            max = min2;
        }
        System.out.println(" max = " + max);

    }
    private void task_3(){
                 int x1,x2,x3,y1,y2,y3 = 0;
                 x1 = bnchrandom.nextInt(100 - 10);
        x2 = bnchrandom.nextInt(100 - 10);
        x3 = bnchrandom.nextInt(100 - 10);
        y1 = bnchrandom.nextInt(100 - 10);
        y2 = bnchrandom.nextInt(100 - 10);
        y3 = bnchrandom.nextInt(100 - 10);
         System.out.println("Point A -> ");
         System.out.print(" x1 = " + x1);
         System.out.print(" y1 = " + y1);
         System.out.println("\n Point B -> ");
         System.out.print(" x2 = " + x2);
         System.out.print(" y2 = " + y2);
         System.out.println("\n Point C -> ");
         System.out.print(" x3 = " + x3);
         System.out.print(" y3 = " + y3);
         if(x1 == x2 && x2 == x3){

             System.out.println("Point A,B,C are located on one straight line!!!");
         }
         else if (y1 == y2 && y2 == y3){

             System.out.println("Point A,B,C are located on one straight line!!!");
         }
         else {
             System.out.println("Point A,B,C ARE NOT located on one straight line!!!");
         }
    }
    protected void task_4 (){
         int A,B,x,y,z = 0;
         System.out.println(" Size hole - >");
        A = bnchrandom.nextInt(100-10);
         System.out.println(" Point A = " + A );
        B = bnchrandom.nextInt(100-10);
         System.out.print(" B = " + B);
         System.out.println(" Bricks size - >");
        x = bnchrandom.nextInt(100-10);
         System.out.println("\n x (wight) = " + x);
        y = bnchrandom.nextInt(100-10);
         System.out.print(" \n y (long) = " + y);
        z = bnchrandom.nextInt(100-10);
         System.out.println("\n z (height) = " + z);
         if(A == x && B == z || A == z && B == x  ){

             System.out.println(" The bricked pass through the hole!!!");
         }
         else {

             System.out.println(" The bicket does not pass through the hole!!!");
         }
    }
}
