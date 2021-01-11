package by.epam.introjava.basicsofsoftware;

import java.util.Scanner;

public class LinearPrograms {
    //// 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
//         Scanner scanner = new Scanner(System.in);
    ////2. Вычислить значение выражения по формуле
// (все переменные принимают действительные значения): 𝑏+√𝑏2+4𝑎𝑐2𝑎−𝑎3𝑐+𝑏−2
    //          3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//          𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦
//          𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦∗ 𝑡𝑔 𝑥𝑦
//          4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//          дробную и целую части числа и вывести полученное значение числ
//          5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//          данное значение длительности в часах, минутах и секундах в следующей форме:
//          ННч ММмин SSc
//          6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//          принадлежит закрашенной области, и false — в противном сл
    private double aLinerProgram = 0;
    private double bLinerProgram = 0;
    private double cLinerProgram = 0;
    private double zLinerProgram = 0;
    private int xLinerProgram = 0;
    private int yLinerProgram = 0;
    private int chooseLinerProgram;
    Scanner lpScaner = new Scanner(System.in);
    public LinearPrograms(){

    }
    public void linearPrograms(){
        System.out.println("Which of tasks do you want to solve?");
        System.out.println("1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.");
        System.out.println("2. Вычислить значение выражения по формуле (все переменные принимают действительные значения): " +
                "" + "\uD835\uDC4F+√\uD835\uDC4F2+4\uD835\uDC4E\uD835\uDC502\uD835\uDC4E−\uD835\uDC4E3\uD835\uDC50+\uD835\uDC4F−2 ");
        System.out.println("3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):" +
                "\uD835\uDC60\uD835\uDC56\uD835\uDC5B \uD835\uDC65 + \uD835\uDC50\uD835\uDC5C\uD835\uDC60 \uD835\uDC66/ \uD835\uDC50\uD835\uDC5C\uD835\uDC60 \uD835\uDC65 − \uD835\uDC60\uD835\uDC56\uD835\uDC5B \uD835\uDC66∗ \uD835\uDC61\uD835\uDC54 \uD835\uDC65\uD835\uDC66");
        System.out.println("4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами" +
                "дробную и целую части числа и вывести полученное значение числа");
        System.out.println("5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах." +
                "Вывести данное значение длительности в часах, минутах и секундах в следующей форме:  ННч ММмин SSc");
        System.out.println("6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)" +
                "принадлежит закрашенной области, и false — в противном случае");
        try {
            chooseLinerProgram = lpScaner.nextInt();
            switch (chooseLinerProgram){
                case 1:
                         task_1();
                    break;
                case  2:
task_2();
                    break;
                case 3:
task_3();
                    break;
                case 4:
task_4();
                    break;
                case 5:
task_5();
                    break;
                case 6:
task_6();
                    break;
                case 0 :
                    System.out.println("For enter to press 0");
                if(lpScaner.nextInt() == 0)
                {
                    return;
                }
                break;
            }
        }
        catch (Exception e){
            System.out.println("Check your data!!!");
        }
    }
    public LinearPrograms(double aLinerProgram, double bLinerProgram, double cLinerProgram) {
        this.aLinerProgram = aLinerProgram;
        this.bLinerProgram = bLinerProgram;
        this.cLinerProgram = cLinerProgram;
    }

    public double getaLinerProgram() {
        return aLinerProgram;
    }

    public double getbLinerProgram() {
        return bLinerProgram;
    }

    public double getcLinerProgram() {
        return cLinerProgram;
    }

    public double getzLinerProgram() {
        return zLinerProgram;
    }

    public int getxLinerProgram() {
        return xLinerProgram;
    }

    public int getyLinerProgram() {
        return yLinerProgram;
    }

    public void setaLinerProgram(double aLinerProgram) {
        this.aLinerProgram = aLinerProgram;
    }

    public void setbLinerProgram(double bLinerProgram) {
        this.bLinerProgram = bLinerProgram;
    }

    public void setcLinerProgram(double cLinerProgram) {
        this.cLinerProgram = cLinerProgram;
    }

    public void setzLinerProgram(double zLinerProgram) {
        this.zLinerProgram = zLinerProgram;
    }

    public void setxLinerProgram(int xLinerProgram) {
        this.xLinerProgram = xLinerProgram;
    }

    public void setyLinerProgram(int yLinerProgram) {
        this.yLinerProgram = yLinerProgram;
    }

protected void task_1() {
          try {
              System.out.println("Enter value of a =");
              setaLinerProgram(lpScaner.nextInt());
              System.out.println("Enter value of b =");
              setbLinerProgram(lpScaner.nextInt());
              System.out.println("Enter value of c =");
              setcLinerProgram(lpScaner.nextInt());
setzLinerProgram(((getaLinerProgram()-3)*getbLinerProgram()/2)+getcLinerProgram());
System.out.println("Z = " + getzLinerProgram());
          }
          catch (Exception e){
              System.err.println("Check your  data task 1");
          }


}
protected void task_2(){
        try {
            System.out.println("Enter value of a =");
            setaLinerProgram(lpScaner.nextInt());
            System.out.println("Enter value of b =");
            setbLinerProgram(lpScaner.nextInt());
            System.out.println("Enter value of c =");
            setcLinerProgram(lpScaner.nextInt());
            setzLinerProgram((getbLinerProgram() + Math.sqrt(Math.pow(getbLinerProgram(),2)) + 4 * getaLinerProgram() * getcLinerProgram())/2 * getaLinerProgram() - Math.pow(getaLinerProgram(),3)*3 + Math.pow(getbLinerProgram(),-2));
       System.out.println("Z = " + getzLinerProgram());
        }
        catch (Exception e)
        {
            System.out.println("Check your data task 2");
        }
}
protected void task_3 (){
   try {

   }
   catch (Exception e){
       System.out.println("Check your data task_3");
   }

    System.out.println("Enter value of x =");
    setxLinerProgram(lpScaner.nextInt());
    System.out.println("Enter value of y =");
    setyLinerProgram(lpScaner.nextInt());
    setzLinerProgram(((Math.sin(getxLinerProgram()) - Math.cos(getyLinerProgram()))/(Math.cos(getxLinerProgram()) - Math.sin(getyLinerProgram())))
            * Math.tan(getxLinerProgram()*getyLinerProgram()));
    System.out.println("Z = " + getzLinerProgram());
}
protected void task_4(){
        try {
            System.out.println("Value of a = 123.456");
            System.out.println("Value of R = 0");
            setaLinerProgram(123.456);
            System.out.println("Exchange data");
            setbLinerProgram( ((int)getaLinerProgram()/1000.0 + (getaLinerProgram()-(int) getaLinerProgram()) * 1000 ));
            System.out.println("R = " + getbLinerProgram());
        } catch (Exception e)
        {
            System.out.println("Check your data task_4");
        }
}
//         System.out.println(" Введите время в секундах - >");
//         System.out.print("Time = ");
//         t = scanner.nextDouble();
//         System.out.print("ЧЧ - >"+ (int)t/3600 + " MM - >" + (int)(t%60)/60 + " SS - >" + (int)((t/60)/60)%60);
    protected void task_5(){
        try {
            System.out.println("Enter the Time in seconds - > ");
            setaLinerProgram(lpScaner.nextLong());
            System.out.println("НН = " + (int)getaLinerProgram()/3600+ " MM = " + ((int)getaLinerProgram()%60)/60 + " SS = " + ((int)(getaLinerProgram()/60/60)%60));
        }
        catch (Exception e)
        {
            System.out.println("Check your data task_5");
        }

    }
    protected void task_6 (){

try {
    System.out.println("Enter value of x =");
    setxLinerProgram(lpScaner.nextInt());
    System.out.println("Enter value of y =");
    setyLinerProgram(lpScaner.nextInt());
    if(-4 < getxLinerProgram() && getxLinerProgram() < 4 && -3 < getyLinerProgram() && getyLinerProgram() < 0 )
    {
System.out.println("X & Y are TRUE");
    }
    else if (-2 < getxLinerProgram() && getxLinerProgram() < 2 && 0 < getyLinerProgram() && getyLinerProgram() < 4)
    {
        System.out.println("X & Y are TRUE");
    }
    else {
        System.out.println("X & Y are FALSE");
    }

}
catch (Exception e)
{
    System.err.println("Check your data task_6");
}
    }

}
