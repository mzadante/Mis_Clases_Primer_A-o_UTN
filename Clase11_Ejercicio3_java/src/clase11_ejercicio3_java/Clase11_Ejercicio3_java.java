
package clase11_ejercicio3_java;

import java.util.Scanner;


public class Clase11_Ejercicio3_java {
    public static void main(String[] args) {
        /*
        Ejercicio 4: leer 2 numeros, si son iguales que los multiplique,
        si el primero es mayor que el segundo que los reste y si no que los sume
        */
        Scanner sc =new Scanner(System.in);
        float num1,num2,resultado;
        
        System.out.println("Digite dos numeros: ");
        num1=Float.parseFloat(sc.nextLine());
        num2=Float.parseFloat(sc.nextLine());
        if (num1==num2) {
            resultado=num1*num2;
        }else if (num1>num2) {
            resultado=num1-num2;
        }else{
            resultado=num1+num2;
        }
        System.out.println("resultado = " + resultado);
    }
}
