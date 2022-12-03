
package clase11_ejercicio2_java;

import java.util.Scanner;

public class Clase11_Ejercicio2_java {
    public static void main(String[] args) {
        /*
        Ejercicio 3: En un almacen se hace un 20 % de descuento a los clientes
        cuya compra supere los $100. ¿Cual sera la cantidad que pagara una
        persona por su compra?
        */
        float compra, descuento, precio_final;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la cantidad a pagar: ");
        compra = Float.parseFloat(sc.nextLine());
        if (compra >= 100) {
            descuento = compra *0.2f;
        }else{
            descuento = 0;
        }
        precio_final = compra-descuento;
        System.out.println("El Precio final a pagar es de: $ " + precio_final );
    }
}
