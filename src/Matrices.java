public class Matrices {

    public static void main(String[] args) {
        // 1. Declaración e Inicialización de una Matriz
        int[][] matriz = new int[3][4]; // Matriz de 3 filas y 4 columnas

        // Asignar valores a la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i * j; // Asignamos el producto de los índices
            }
        }

        // Imprimir la matriz
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // 2. Declaración e Inicialización de una Matriz con Valores
        int[][] matrizConValores = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Imprimir la matriz con valores
        System.out.println("\nMatriz con valores:");
        for (int i = 0; i < matrizConValores.length; i++) {
            for (int j = 0; j < matrizConValores[i].length; j++) {
                System.out.print(matrizConValores[i][j] + " ");
            }
            System.out.println();
        }

        // 3. Operaciones Comunes

        // Acceder a un elemento específico
        int elemento = matrizConValores[1][2]; // Elemento en la fila 1, columna 2
        System.out.println("\nElemento en la fila 1, columna 2: " + elemento);

        // Modificar un elemento específico
        matrizConValores[1][2] = 10; // Modificar el elemento en la fila 1, columna 2
        System.out.println("Matriz después de modificar el elemento en la fila 1, columna 2:");
        for (int i = 0; i < matrizConValores.length; i++) {
            for (int j = 0; j < matrizConValores[i].length; j++) {
                System.out.print(matrizConValores[i][j] + " ");
            }
            System.out.println();
        }

        // 4. Matrices Irregulares (Matrices Jagged)
        int[][] matrizIrregular = new int[3][]; // Matriz de 3 filas con número variable de columnas
        matrizIrregular[0] = new int[2]; // Fila 0 con 2 columnas
        matrizIrregular[1] = new int[3]; // Fila 1 con 3 columnas
        matrizIrregular[2] = new int[1]; // Fila 2 con 1 columna

        // Asignar valores a la matriz irregular
        for (int i = 0; i < matrizIrregular.length; i++) {
            for (int j = 0; j < matrizIrregular[i].length; j++) {
                matrizIrregular[i][j] = i + j; // Asignamos la suma de los índices
            }
        }

        // Imprimir la matriz irregular
        System.out.println("\nMatriz irregular:");
        for (int i = 0; i < matrizIrregular.length; i++) {
            for (int j = 0; j < matrizIrregular[i].length; j++) {
                System.out.print(matrizIrregular[i][j] + " ");
            }
            System.out.println();
        }
    }
}
