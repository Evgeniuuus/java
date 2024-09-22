package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------Trenirivka Usloviy--------------------------");
        for (int i = 1; i <= 500; i++)
            if (!fizzbuzz(i).isEmpty()) System.out.println(fizzbuzz(i));
        System.out.println("-----------------------Razvorachivaem stroky--------------------------");
        String stroka = "make install";
        System.out.println(ReversedString(stroka.length(),stroka));
        System.out.println("----------------------Reshaem kvadratnoe uravnenie---------------------------");
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("BBedite a,b,c");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        System.out.println(SquareSolver(a,b,c));
        System.out.println("-------------------Summa Ryada-----------------------------");
        double n = 2;
        System.out.println(SummaRuada(n));
        System.out.println("--------------------Stroka Palindrom-----------------------------");
        Scanner scanner1 = new Scanner(System.in);
        stroka = scanner1.nextLine();
        if (!Palindrom(stroka)) System.out.println("It is not a palindrome :(");
        else System.out.println("It is Palindrome!");
    }
    public static String fizzbuzz(int a){
        String output = "";
        if (a % 5 == 0 && a % 7 == 0)
            output = "fizzbuzz";
        else if (a % 5 == 0)
            output = "fizz";
        else if (a % 7 == 0)
            output = "buzz";
        return output;
    }

    public static String ReversedString(int a, String str){
        char[] X = new char[a];
        for (int i=a-1; i>=0; i--)
            X[a-i-1] = str.charAt(i);
        return new String(X);
    }

    public  static String SquareSolver (double a,double b,double c){
        double D;
        D = b * b - 4 * a * c;
        String solution;
        if (D > 0) {
            double x1, x2;
            x1 = (-1*b-Math.sqrt(D))/(2*a);
            x2 = (-1*b+Math.sqrt(D))/(2*a);
            solution = "\n" + "x1 = " + x1 + "  x2 = " + x2 ;
        } else if (D == 0) {
            double x;
            x = (-1*b)/(2*a);
            solution = "\n" + "x = " + x;
        } else solution = "\nNet korney!";
        return solution;
    }

    public static double SummaRuada(double n) {
        double Summa = 0;
        while (true) {
            if (1 / (n * n + n-2) > 1e-6){
                Summa += 1 / (n * n + n - 2);
                n++;
            }
            else break;
        }
        return Summa;
    }

    public static boolean Palindrom(String stroka){
        boolean f = false;
        for (int i = 0; i < stroka.length() / 2; i++) {
            if (stroka.charAt(i) != stroka.charAt(stroka.length()-i-1)) break;
            f = true;
        }
        return  f;
    }
}