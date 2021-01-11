package by.epam.introjava.basicsofsoftware;
////////////////////////Циклы
//1. Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа.
//                  int n, summ= 0;
//         Scanner scanner = new Scanner(System.in);
//         System.out.println(" Enter value n - >");
//        n = scanner.nextInt();
//
//        for (int i =0;i<=n;i++){
//            summ = summ+i;
//        }
//         System.out.println(summ);
//
//
///////  2. Вычислить значения функции на отрезке [а,b] c шагом h:
//         int a,b,h, Y = 0;
//         Scanner scanner = new Scanner(System.in);
//         System.out.println(" Enter value a - >");
//         a = scanner.nextInt();
//         System.out.println(" Enter value b - >");
//         a = scanner.nextInt();



//         ///////3. Найти сумму квадратов первых ста чисел.
//                      int  summ= 0;
//       Scanner scanner = new Scanner(System.in);
//         for (int i =0; i<=100;i++){
//
//             summ +=i*i;
//         }
//         System.out.println("Sum of squaries - >" + summ);

////// 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
//
// int summ = 1;
// long x =0;
//       Scanner scanner = new Scanner(System.in);
//         for (int i =1; i<=200;i++){
//             BigInteger a = BigInteger.valueOf(summ  +=  (i * i));
//             x = a.longValue();
//         }
//         System.out.println("Sum of squaries - >" + x);

import java.util.Random;
public class Cycles {
 Random clRandom = new Random();
 public int getSumma() {
  return summa;
 }

 public int getA() {
  return a;
 }

 public int getB() {
  return b;
 }

 public int getH() {
  return h;
 }

 public void setSumma(int summa) {
  this.summa = summa;
 }

 public void setA(int a) {
  this.a = a;
 }

 public void setB(int b) {
  this.b = b;
 }

 public void setH(int h) {
  this.h = h;
 }

 public int getN() {
  return n;
 }
public void setN(int n){
  this.n = n;
}

 public int getY() {
  return y;
 }

 public void setClRandom(Random clRandom) {
  this.clRandom = clRandom;
 }

 public void setY(int y) {
  this.y = y;
 }

 public int getX() {
  return x;
 }

 public void setX(int x) {
  this.x = x;
 }

 @Override
 public String toString() {
  return "Summa=" + summa;
 }

 private int summa,a,b,h,n,y,x;
 public Cycles(){
//  task_1();
//  task_2();
//  task_3();
  task_4();
 }
 private  void task_1(){
  try {
   setN(clRandom.nextInt(100 - 1 ));
   System.out.println("Counts of elements are -> " + getN());
   for (int i =1;i<= getN();i++ ){
    setSumma(getSumma() + i);
   }
   System.out.println(" Summa of elements are - > " + getSumma());
  }
  catch (Exception e){
   System.err.println(e.toString());
  }
 }
 private void task_2(){
try {
 setA(clRandom.nextInt(10) - 20);
 setB(clRandom.nextInt(100-1) );
 setH(clRandom.nextInt(20-1));
System.out.println("a = " + getA() + " b = " + getB() + " h = " + getH());
 for (int i = getA();i<= getB();i++){
      i += getH();
      System.out.println("i = " + i);
  if (getA() > 2) {
setY(getA());
  }
  else if (getA() < - 2) {
setY(- getA());
  }
System.out.println("Y = " + getY());
 }

}
catch (Exception e) {
 System.out.println(e.toString());
}
 }
 private void task_3(){
  setSumma(0);
  for (int i = 0;i<=100;i++){
   summa+= i*i;

  }
  System.out.println("Summa of squires = "+ getSumma());
 }
 private void task_4(){

  for (int i = 1;i<=200;i++){
   summa+=(i*i);
  }
  System.out.println("Sum of squaries - >" + summa);
 }
}
