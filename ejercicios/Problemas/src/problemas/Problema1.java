/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};

        imprimirDatos(informacion);
        // LLamamos al método para imprimir los valores pares
    }
    
    // Creamos un método que imprime los valores pares 
    // Recibe como siguiente un arreglo bidimensional de solo enteros
    public static void imprimirDatos(int[][] arregloBidimensional) {
        System.out.println("Valores pares del arreglo bidimensional:");

        for (int i = 0; i < arregloBidimensional.length; i++) {
        // Este ciclo for itera a traves de las filas del arreglo 
            for (int j = 0; j < arregloBidimensional[i].length; j++) {
            // Este ciclo for itera a travez de las columnas de cada fila
                if (arregloBidimensional[i][j] % 2 == 0) {
                // La presente linea de codigo verifica si el numero es par
                    System.out.println(arregloBidimensional[i][j]);
                    // Finalmente imprime el valor de par
                }
            }
        }
    }
}
