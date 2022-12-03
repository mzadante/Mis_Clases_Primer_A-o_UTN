
package Ejercicio1;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite el nombre del Libro: ");
        String nombreLibro = entrada.nextLine();
        System.out.println("Digite el Autor del Libro");
        String autorLibro = entrada.nextLine();
        System.out.println("Digite el id del libro: ");
        int idLibro = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el Precio del Libro: ");
        double precioLibro = Double.parseDouble(entrada.nextLine());
        System.out.println("Confirme si el envio es gratuito: ");
        boolean envioGratis = Boolean.parseBoolean(entrada.nextLine());
        
        System.out.println(nombreLibro+" #"+idLibro);
        System.out.println("Precio del libro: $"+ precioLibro);
        System.out.println("El envio del Libro gratuito es: "+ envioGratis);
        
    }
}
