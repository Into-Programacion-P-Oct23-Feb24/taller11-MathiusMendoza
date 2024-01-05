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
public class Problema5 {

    public static void main(String[] args) {
        // Creamos un arreglo bidimencional
        // Declaramos la sumaTotal(Funcion), para calcular la suma
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int sumaTotal;
        // Imprime la suma total
        sumaTotal = obtenerSuma(informacion);
        System.out.println(sumaTotal);
    }

    public static int obtenerSuma(int[][] datos) {
        // Declaramos una variable para acumular la suma total
        int sumaTotal = 0;
        // Un for para recorrrer las filas del arreglo
        for (int i = 0; i < datos.length; i++) {
            // Para recorrer por las columnas del arreglo
            for (int j = 0; j < datos[i].length; j++) {
                // Sumamos el numero actual a la suma total
                sumaTotal = sumaTotal + datos[i][j];
            }
        }
        // Devuelvo la suma total
        return sumaTotal;
    }
}
