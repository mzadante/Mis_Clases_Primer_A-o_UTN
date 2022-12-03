package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota1, nota2, nota3, suma;
        System.out.println("Digite tres calificaciones");
        nota1 = Float.parseFloat(sc.nextLine());
        nota2 = Float.parseFloat(sc.nextLine());
        nota3 = Float.parseFloat(sc.nextLine());
        suma = nota1+nota2+nota3;
        System.out.println("\nLa suma de las notas es : " + suma);
    }


}
