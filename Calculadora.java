package com.mycompany.calculadora;
import java.util.Scanner;

public class calculadora {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Calculadora - Operaciones disponibles:");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicacion");
        System.out.println("4) Division");
        System.out.println("5) Seno");
        System.out.println("6) Coseno");
        System.out.println("7) Tangente");
        System.out.println("8) Raiz enesima");
        System.out.println("9) Potencia enesima");
        System.out.println("10) Calcular IVA");
        
        System.out.println("Seleccione ua operacion a realizar (1-10): ");
        int opcion = input.nextInt();
        
    }
}
