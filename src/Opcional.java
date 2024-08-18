import java.util.Optional;

public class Opcional {
    public static void main(String[] args) {
        // Ejemplo 1: Creación de un Optional que contiene un valor
        Optional<String> nombre = Optional.of("Fernando");
        System.out.println("Valor presente: " + nombre.get());

        // Ejemplo 2: Creación de un Optional vacío
        Optional<String> sinNombre = Optional.empty();
        System.out.println("Valor ausente: " + sinNombre);

        // Ejemplo 3: Creación de un Optional que podría contener un valor nulo
        String posibleNulo = null;
        Optional<String> nombrePosible = Optional.ofNullable(posibleNulo);
        System.out.println("Valor posible: " + nombrePosible);

        // Ejemplo 4: Verificación si hay un valor presente
        if (nombrePosible.isPresent()) {
            System.out.println("El nombre es: " + nombrePosible.get());
        } else {
            System.out.println("El nombre está ausente.");
        }

        // Ejemplo 5: Uso de orElse para proporcionar un valor por defecto
        String valorPorDefecto = nombrePosible.orElse("Valor por defecto");
        System.out.println("Valor por defecto: " + valorPorDefecto);

        // Ejemplo 6: Uso de orElseGet para proporcionar un valor por defecto utilizando un proveedor
        String valorConProveedor = nombrePosible.orElseGet(() -> "Valor generado");
        System.out.println("Valor con proveedor: " + valorConProveedor);

        // Ejemplo 7: Uso de orElseThrow para lanzar una excepción si no hay valor presente
        try {
            String valorLanzandoExcepcion = nombrePosible.orElseThrow(() -> new IllegalArgumentException("Valor ausente"));
            System.out.println("Valor lanzando excepción: " + valorLanzandoExcepcion);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción lanzada: " + e.getMessage());
        }

        // Ejemplo 8: Uso de ifPresent para ejecutar una acción si el valor está presente
        nombre.ifPresent(valor -> System.out.println("Valor presente: " + valor));

        // Ejemplo 9: Uso de map para transformar el valor si está presente
        Optional<Integer> longitudDelNombre = nombre.map(String::length);
        System.out.println("Longitud del nombre: " + longitudDelNombre.orElse(0));
    }
}
