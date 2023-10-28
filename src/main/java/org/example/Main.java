package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int a = scaner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = scaner.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int c = scaner.nextInt();
        scaner.close();

        System.out.println(iguales(a,b,c));


    }

    public static String iguales(int a, int b, int c){
        String x = "";
        if (a==b & a==c){x= "todos los números son iguales, resultado: " + a;}
        else {
            System.out.println( mayor(a,b,c));
            System.out.println( menor(a,b,c));
        }
        return  x;
    }

    public static String mayor(int a, int b, int c){
        String x = "";
        if (a>=b & a>=c){x= "el número mayor es: " + a;}
        else if (b>=a & b>=c){x="el número mayor es: " + b;}
        else if (c>=a & c>=b){x ="el número mayor es: " + c;}
        return  x;
    }
    public static String menor(int a, int b, int c){
        String x = "";
        if (a<=b & a<=c){x= "el número menor es: " + a;}
        else if (b<=a & b<=c){x="el número menor es: " + b;}
        else if (c<=a & c<=b){x ="el número menor es: " + c;}
        return  x;
    }

}