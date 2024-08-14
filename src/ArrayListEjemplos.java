import java.util.ArrayList;
import java.util.List;

public class ArrayListEjemplos {

    public static void main(String[] args) {
        // Crear una ArrayList de enteros
        List<Integer> numeros = new ArrayList<>();

        // Agregar elementos al final de la lista
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        System.out.println("Lista después de agregar elementos al final: " + numeros);

        // Agregar un elemento al inicio de la lista
        numeros.add(0, 5); // Inserta 5 en el índice 0
        System.out.println("Lista después de agregar 5 al inicio: " + numeros);

        // Agregar un elemento al final de la lista nuevamente
        numeros.add(60); // Añade 60 al final de la lista
        System.out.println("Lista después de agregar 60 al final: " + numeros);

        // Imprimir la lista
        System.out.println("Lista actual:");
        imprimirArreglo(numeros);

        // Obtener el tamaño de la lista
        System.out.println("Tamaño de la lista: " + numeros.size());

        // Acceder a un elemento por índice
        System.out.println("Elemento en índice 2: " + numeros.get(2));

        // Modificar un elemento en un índice específico
        numeros.set(2, 35);
        System.out.println("Lista después de modificar el índice 2: " + numeros);

        // Eliminar un elemento por índice
        numeros.remove(1); // Elimina el elemento en el índice 1 (20)
        System.out.println("Lista después de eliminar el índice 1: " + numeros);

        // Verificar si la lista contiene un elemento
        boolean contiene30 = numeros.contains(30);
        System.out.println("La lista contiene 30: " + contiene30);

        // Obtener el índice de un elemento
        int indice = numeros.indexOf(35);
        System.out.println("Índice del elemento 35: " + indice);

        // Iterar sobre la lista utilizando un bucle for-each
        System.out.println("Elementos de la lista utilizando bucle for-each:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        // Limpiar la lista
        numeros.clear();
        System.out.println("Lista después de limpiar: " + numeros);

        // Comprobar si la lista está vacía
        boolean estaVacia = numeros.isEmpty();
        System.out.println("La lista está vacía: " + estaVacia);
    }

    // Método para imprimir un arreglo (lista en este caso)
    private static void imprimirArreglo(List<Integer> lista) {
        for (Integer i : lista) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

