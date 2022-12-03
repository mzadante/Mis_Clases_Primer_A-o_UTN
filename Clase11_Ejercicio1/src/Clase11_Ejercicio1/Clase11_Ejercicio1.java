package Clase11_Ejercicio1;
import java.util.Scanner;
public class Clase11_Ejercicio1 {
    public static void main(String[] args) {
        /*Ejercicio 2: Determinar si un alumno aprueba o reprueba un curso, sabiendo que
        aprobara si su promedio de tres calificaciones es mayor o igual a 70,
        reprueba en caso contrario*/
        float nota1, nota2, nota3, promedio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite las notas de las tres calificaciones: ");
        nota1 = Float.parseFloat(sc.nextLine());
        nota2 = Float.parseFloat(sc.nextLine());
        nota3 = sc.nextFloat();
        promedio = (nota1+nota2+nota3)/3;
        if (promedio >= 70) {
            System.out.println("El alumno aprobo con: " + promedio);
        }else{
            System.out.println("El alumno desaprobo con: " + promedio);
        }
    }
}
