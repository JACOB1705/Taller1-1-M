package com.mycompany.calculadora;
import java.util.Scanner;

public class Calculadora {
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
        
        switch (opcion){
            case 1: 
                System.out.println("Ingrese el primer numero: ");
                double num1 = input.nextDouble();
                System.out.println("Ingrese el primer numero: ");
                double num2 = input.nextDouble();
                System.out.println("Resultado: "+(num1+num2));
                break;
            case 2:
                System.out.println("Ingrese el primer numero: ");
                num1 = input.nextDouble();
                System.out.println("Ingrese el primer numero: ");
                num2 = input.nextDouble();
                System.out.println("Resultado: "+(num1-num2));
                break;
            case 3:
                System.out.println("Ingrese el primer numero: ");
                num1 = input.nextDouble();
                System.out.println("Ingrese el primer numero: ");
                num2 = input.nextDouble();
                System.out.println("Resultado: "+(num1*num2));
                break;
            case 4:
                System.out.println("Ingrese el primer numero: ");
                num1 = input.nextDouble();
                System.out.println("Ingrese el primer numero: ");
                num2 = input.nextDouble();
                if(num2!=0){
                    System.out.println("Resultado: "+(num1/num2));
                }else{
                    System.out.println("Resultado: invalido, no es divisible en 0 ");
                }
                
                
                break;            
        }
    }
}
