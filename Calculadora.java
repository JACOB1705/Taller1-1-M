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
                System.out.println("Ingrese el segundo numero: ");
                double num2 = input.nextDouble();
                System.out.println("Resultado: "+(num1+num2));
                break;
            case 2:
                System.out.println("Ingrese el primer numero: ");
                num1 = input.nextDouble();
                System.out.println("Ingrese el segundo numero: ");
                num2 = input.nextDouble();
                System.out.println("Resultado: "+(num1-num2));
                break;
            case 3:
                System.out.println("Ingrese el primer numero: ");
                num1 = input.nextDouble();
                System.out.println("Ingrese el segundo numero: ");
                num2 = input.nextDouble();
                System.out.println("Resultado: "+(num1*num2));
                break;
            case 4:
                System.out.println("Ingrese el primer numero: ");
                num1 = input.nextDouble();
                System.out.println("Ingrese el segundo numero: ");
                num2 = input.nextDouble();
                if(num2!=0){
                    System.out.println("Resultado: "+(num1/num2));
                }else{
                    System.out.println("Resultado: invalido, no es divisible en 0 ");
                }
                break;  
            case 5:
                System.out.println("Ingrese el angulo en grados : ");
                num1 = input.nextDouble();
                num2 = Math.toRadians(num1);
                double res = Math.sin(num2);

                System.out.println("Resultado: "+res);
                break;
            case 6:
                System.out.println("Ingrese el angulo en grados : ");
                num1 = input.nextDouble();
                num2 = Math.toRadians(num1);
                res = Math.cos(num2);

                System.out.println("Resultado: "+res);
                break;
            case 7:
                System.out.println("Ingrese el angulo en grados : ");
                num1 = input.nextDouble();
                num2 = Math.toRadians(num1);
                res = Math.tan(num2);

                System.out.println("Resultado: "+res);
                break;
            case 8:
                System.out.println("Ingrese un numero: ");
                num1 = input.nextDouble();
                System.out.println("Ingrese el valor de n para la raíz enésima: ");
                num2 = input.nextDouble();
                res = Math.pow(num1,1/num2);
                System.out.println("Resultado: "+res);
                break;
            case 9:
                System.out.println("Ingrese la base: ");
                num1 = input.nextDouble();
                System.out.println("Ingrese el valor de la potencia: ");
                num2 = input.nextDouble();
                res = Math.pow(num1,num2);
                System.out.println("Resultado: "+res);
                break;
        }
    }
}
