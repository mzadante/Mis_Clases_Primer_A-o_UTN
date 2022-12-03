
package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int a;int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        a = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        b = sc.nextInt();
        System.out.println("El numero mayor es: ");
        System.out.println(a>b ? a:b);
        
    }
}
