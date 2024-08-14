import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

public class Colecciones {

    public static void main(String[] args) {
        // Uso de List
        List<String> list = new ArrayList<>();
        list.add("B");
        list.add("A");
        list.add("C");
        System.out.println("Lista original: " + list);

        // Ordenar la lista
        Collections.sort(list);
        System.out.println("Lista ordenada: " + list);

        // Uso de Set
        Set<String> set = new HashSet<>();
        set.add("Elemento1");
        set.add("Elemento2");
        set.add("Elemento1"); // Duplicado
        System.out.println("Conjunto: " + set);

        // Uso de Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("Primero");
        queue.add("Segundo");
        System.out.println("Cola: " + queue);

        // Obtener y eliminar el primer elemento
        System.out.println("Elemento en el frente de la cola: " + queue.peek());
        queue.poll();
        System.out.println("Cola después de eliminar el primer elemento: " + queue);

        // Uso de Deque
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Inicio");
        deque.addLast("Fin");
        System.out.println("Deque: " + deque);

        // Convertir entre Arreglos y Listas
        String[] array = {"Uno", "Dos", "Tres"};
        List<String> listFromArray = Arrays.asList(array);
        System.out.println("Lista desde arreglo: " + listFromArray);

        // Modificar la lista
        listFromArray.set(1, "Dos Modificado");
        System.out.println("Lista modificada: " + listFromArray);

        // Uso de Collections Utility
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        System.out.println("Lista de números: " + numbers);

        // Ordenar la lista de números
        Collections.sort(numbers);
        System.out.println("Lista de números ordenada: " + numbers);

        // Buscar un elemento en la lista
        int index = Collections.binarySearch(numbers, 2);
        System.out.println("Índice del elemento '2': " + index);
    }
}
