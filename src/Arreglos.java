import java.util.Arrays;

public class Arreglos {

    public static void main(String[] args) {
        // Declaración e inicialización de un arreglo de enteros
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Arreglo original:");
        imprimirArreglo(numeros);

        // Ordenar el arreglo
        Arrays.sort(numeros);
        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));

        // Crear una copia del arreglo
        int[] copia = Arrays.copyOf(numeros, 7);
        System.out.println("Copia del arreglo con tamaño 7: " + Arrays.toString(copia));

        // Crear una copia de una parte del arreglo (rango de índices)
        int[] parte = Arrays.copyOfRange(numeros, 1, 4);
        System.out.println("Parte del arreglo (índices 1 a 3): " + Arrays.toString(parte));

        // Llenar el arreglo con un valor específico
        Arrays.fill(numeros, 7);
        System.out.println("Arreglo lleno de 7: " + Arrays.toString(numeros));

        // Comparar dos arreglos
        int[] arreglo1 = {1, 2, 3};
        int[] arreglo2 = {1, 2, 3};
        int[] arreglo3 = {1, 2, 4};
        System.out.println("Arreglos 1 y 2 son iguales: " + Arrays.equals(arreglo1, arreglo2));
        System.out.println("Arreglos 1 y 3 son iguales: " + Arrays.equals(arreglo1, arreglo3));

        // Convertir el arreglo en un Stream y calcular la suma de los valores
        int suma = Arrays.stream(arreglo1).sum();
        System.out.println("Suma de los valores del arreglo1: " + suma);

        // Encontrar el índice de un valor en un arreglo
        int valorBuscado = 2;
        int indice = Arrays.binarySearch(arreglo1, valorBuscado);
        System.out.println("Índice de " + valorBuscado + " en arreglo1: " + indice);

        // Declaración e inicialización de un arreglo de cadenas
        String[] nombres = {"Ana", "Luis", "Pedro", "María"};
        System.out.println("Arreglo de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Declaración e inicialización de una matriz (arreglo bidimensional)
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i * j;
            }
        }

        // Imprimir la matriz
        System.out.println("Matriz:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    // Método para imprimir un arreglo
    private static void imprimirArreglo(int[] arreglo) {
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
