/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

 import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la figura para calcular el área:");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triángulo");
        System.out.println("3. Rectángulo");

        // Me permite ingresar dator por teclado
        int opcion = scanner.nextInt();

        // Me permite escojer el tipo de opcion, de el cual el usuario escoje al
        // ingresar el dato a buscar.
        switch (opcion) {
            case 1:
                obtenerAreaCuadrado();
                break;
            case 2:
                obtenerAreaTriangulo();
                break;
            case 3:
                obtenerAreaRectangulo();
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione 1, 2 o 3.");
        }
    }

    public static void obtenerAreaCuadrado() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el lado del cuadrado:");
        double lado = scanner.nextDouble();

        // calcula la area del cuadrado
        double area = lado * lado;

        // presenta el resultado
        System.out.println("El área del cuadrado es: " + area);
    }

    public static void obtenerAreaTriangulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base del triángulo:");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la altura del triángulo:");
        double altura = scanner.nextDouble();

        // calcula el area del triangulo
        double area = (base * altura) / 2;

        // presenta el resultado
        System.out.println("El área del triángulo es: " + area);
    }

   
    public static void obtenerAreaRectangulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base del rectángulo:");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la altura del rectángulo:");
        double altura = scanner.nextDouble();

        // calcula el área del rectángulo
        double area = base * altura;

        // presenta el el resultado
        System.out.println("El área del rectángulo es: " + area);
    }
}
