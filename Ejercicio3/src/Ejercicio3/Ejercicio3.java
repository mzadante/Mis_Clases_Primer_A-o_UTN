package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        int alto;
        int ancho;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el Alto del rectangulo: ");
        alto = sc.nextInt();
        System.out.println("Digite el Ancho del rectangulo: ");
        ancho = sc.nextInt();
        
        var area= alto * ancho;
        var perimetro = (alto+ancho)*2;
        
        System.out.println("El area del Rectangulo es: " + area);
        System.out.println("El perimetro del Rectangulo es: " + perimetro);
        
        

    }
}
