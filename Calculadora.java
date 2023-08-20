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
            case 1 -> { 
                System.out.println("Ingrese el primer numero: ");
                double num1 = input.nextDouble();
                System.out.println("Ingrese el segundo numero: ");
                double num2 = input.nextDouble();
                System.out.println("Resultado: "+(num1+num2));
            }
            case 2 -> {
                System.out.println("Ingrese el primer numero: ");
                double num1 = input.nextDouble();
                System.out.println("Ingrese el segundo numero: ");
                double num2 = input.nextDouble();
                System.out.println("Resultado: "+(num1-num2));
            }
            case 3 -> {
                System.out.println("Ingrese el primer numero: ");
                double num1 = input.nextDouble();
                System.out.println("Ingrese el segundo numero: ");
                double num2 = input.nextDouble();
                System.out.println("Resultado: "+(num1*num2));
            }
            case 4 -> {
                System.out.println("Ingrese el primer numero: ");
                double num1 = input.nextDouble();
                System.out.println("Ingrese el segundo numero: ");
                double num2 = input.nextDouble();
                if(num2!=0){
                    System.out.println("Resultado: "+(num1/num2));
                }else{
                    System.out.println("Resultado: invalido, no es divisible en 0 ");
                }
            }
            case 5 -> {
                System.out.println("Ingrese el angulo en grados : ");
                double num1 = input.nextDouble();
                double num2 = Math.toRadians(num1);
                double res = Math.sin(num2);
                System.out.println("Resultado: "+res);
            }
            case 6 -> {
                System.out.println("Ingrese el angulo en grados : ");
                double num1 = input.nextDouble();
                double num2 = Math.toRadians(num1);
                double res = Math.cos(num2);
                System.out.println("Resultado: "+res);
            }
            case 7 -> {
                System.out.println("Ingrese el angulo en grados : ");
                double num1 = input.nextDouble();
                double num2 = Math.toRadians(num1);
                double res = Math.tan(num2);
                if(num1==90 || num1 ==270){
                    System.out.println("La tangente de ese angulo es indefinida");
                }else{
                    System.out.println("Resultado: "+res);
                }
                
            }
            case 8 -> {
                System.out.println("Ingrese un numero: ");
                double num1 = input.nextDouble();
                System.out.println("Ingrese el valor de n para la raíz enésima: ");
                double num2 = input.nextDouble();
                double res = Math.pow(num1,1/num2);
                System.out.println("Resultado: "+res);
            }
            case 9 -> {
                System.out.println("Ingrese la base: ");
                double num1 = input.nextDouble();
                System.out.println("Ingrese el valor de la potencia: ");
                double num2 = input.nextDouble();
                double res = Math.pow(num1,num2);
                System.out.println("Resultado: "+res);
            }
            case 10 -> {
                System.out.print("Ingrese el monto: ");
                double monto = input.nextDouble();
                System.out.print("Ingrese el porcentaje de IVA: ");
                double porcentaje = input.nextDouble();
                double iva = (monto * porcentaje) / 100;
                System.out.println("IVA: " + iva);
            }
             default -> System.out.println("Operación no válida.");
        }
    }
}
