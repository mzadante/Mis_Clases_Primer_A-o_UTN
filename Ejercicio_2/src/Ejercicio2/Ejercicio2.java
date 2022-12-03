
package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float precio_hora;
        int horas_semanales;
        float resultado;
        System.out.println("Digite las Horas Semanales trabajadas: ");
        horas_semanales = Integer.parseInt(sc.nextLine());
        System.out.println("Digite el salario por hora de trabajo: ");
        precio_hora = Float.parseFloat(sc.nextLine());
        resultado = precio_hora*horas_semanales;
        System.out.println("\nEl salario semanal es de: $" + resultado);
        
    }
    
}
