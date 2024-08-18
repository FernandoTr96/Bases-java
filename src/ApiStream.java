import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ApiStream {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1. filter: Filtra los elementos según una condición
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Números pares: " + pares);

        // 2. map: Transforma cada elemento de la secuencia
        List<Integer> cuadrados = numeros.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Cuadrados de los números: " + cuadrados);

        // 3. flatMap: Aplana una secuencia de secuencias
        List<List<Integer>> listaDeListas = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> aplanada = listaDeListas.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("Lista aplanada: " + aplanada);

        // 4. distinct: Elimina elementos duplicados
        List<Integer> conDuplicados = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> sinDuplicados = conDuplicados.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Sin duplicados: " + sinDuplicados);

        // 5. sorted: Ordena los elementos del stream
        List<Integer> ordenados = numeros.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Números ordenados: " + ordenados);

        // 6. peek: Realiza una operación sobre cada elemento sin consumir el stream
        List<Integer> modificados = numeros.stream()
                .peek(n -> System.out.println("Procesando número: " + n))
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("Números modificados: " + modificados);

        // 7. limit: Limita el número de elementos en el stream
        List<Integer> limitados = numeros.stream()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Primeros 5 números: " + limitados);

        // 8. skip: Salta un número de elementos en el stream
        List<Integer> saltados = numeros.stream()
                .skip(5)
                .collect(Collectors.toList());
        System.out.println("Saltando los primeros 5 números: " + saltados);

        // 9. collect: Recoge los elementos del stream en una colección
        List<Integer> listaRecogida = numeros.stream()
                .collect(Collectors.toList());
        System.out.println("Lista recogida: " + listaRecogida);

        // 10. reduce: Reduce los elementos del stream a un único valor
        int sumaTotal = numeros.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Suma total de los números: " + sumaTotal);

        // 11. count: Cuenta el número de elementos en el stream
        long count = numeros.stream()
                .count();
        System.out.println("Cantidad de números: " + count);

        // 12. anyMatch: Verifica si al menos un elemento cumple una condición
        boolean hayPares = numeros.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println("¿Hay algún número par?: " + hayPares);

        // 13. allMatch: Verifica si todos los elementos cumplen una condición
        boolean todosPositivos = numeros.stream()
                .allMatch(n -> n > 0);
        System.out.println("¿Todos los números son positivos?: " + todosPositivos);

        // 14. noneMatch: Verifica si ningún elemento cumple una condición
        boolean ningunNegativo = numeros.stream()
                .noneMatch(n -> n < 0);
        System.out.println("¿Ningún número es negativo?: " + ningunNegativo);

        // 15. findFirst: Encuentra el primer elemento en el stream
        Optional<Integer> primero = numeros.stream()
                .findFirst();
        System.out.println("Primer número: " + primero.orElse(null));

        // 16. findAny: Encuentra algún elemento en el stream (no garantizado el primero)
        Optional<Integer> cualquiera = numeros.stream()
                .findAny();
        System.out.println("Algún número: " + cualquiera.orElse(null));

        // 17. min: Encuentra el valor mínimo en el stream
        Optional<Integer> minimo = numeros.stream()
                .min(Integer::compare);
        System.out.println("Número mínimo: " + minimo.orElse(null));

        // 18. max: Encuentra el valor máximo en el stream
        Optional<Integer> maximo = numeros.stream()
                .max(Integer::compare);
        System.out.println("Número máximo: " + maximo.orElse(null));

        // 19. forEach: Realiza una acción para cada elemento en el stream
        System.out.println("Imprimiendo todos los números:");
        numeros.stream()
                .forEach(n -> System.out.println(n));
    }
}
