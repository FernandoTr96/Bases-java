import java.util.Arrays;
import java.util.List;

public class ExpresionesLambda {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Expresión lambda para imprimir cada número
        numeros.forEach(n -> System.out.println("Número: " + n));

        // Expresión lambda para sumar todos los números de la lista
        int suma = numeros.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Suma de los números: " + suma);

        // Expresión lambda para filtrar números pares
        List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0).toList();
        System.out.println("Números pares: " + pares);
    }
}
