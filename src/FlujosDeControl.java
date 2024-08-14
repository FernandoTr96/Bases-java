import java.util.ArrayList;
import java.util.List;

public class FlujosDeControl {

    public static void main(String[] args) {
        // Ejemplo de estructura condicional: if-else
        int number = 10;
        if (number > 0) {
            System.out.println("El número es positivo.");
        } else if (number < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // Ejemplo de estructura condicional: switch-case
        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día inválido.");
                break;
        }

        // Ejemplo de bucle: for
        System.out.println("Bucle for:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        // Ejemplo de bucle: while
        System.out.println("Bucle while:");
        int count = 0;
        while (count < 5) {
            System.out.println("count = " + count);
            count++;
        }

        // Ejemplo de bucle: do-while
        System.out.println("Bucle do-while:");
        int count2 = 0;
        do {
            System.out.println("count2 = " + count2);
            count2++;
        } while (count2 < 5);

        // Ejemplo de bucle: foreach con lista
        System.out.println("Bucle foreach con lista:");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        for (int numberInList : numbers) {
            System.out.println("Número: " + numberInList);
        }

        // Ejemplo de bucle: foreach con arreglo
        System.out.println("Bucle foreach con arreglo:");
        int[] array = {5, 10, 15, 20};

        for (int num : array) {
            System.out.println("Elemento: " + num);
        }

        // Ejemplo de control de flujo: break y continue
        System.out.println("Uso de break y continue:");
        for (int j = 0; j < 5; j++) {
            if (j == 2) {
                continue; // Salta la iteración actual
            }
            if (j == 4) {
                break; // Sale del bucle
            }
            System.out.println("j = " + j);
        }

        // Ejemplo de control de excepciones: try-catch-finally
        try {
            int result = 10 / 0; // Esto causará una excepción ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        } finally {
            System.out.println("Bloque finally ejecutado siempre.");
        }
    }
}
