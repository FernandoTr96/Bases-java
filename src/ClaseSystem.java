public class ClaseSystem {
    public static void main(String[] args) {
        // Obtener la salida estándar (System.out) y mostrar un mensaje
        System.out.println("Este es un mensaje en la salida estándar.");

        // Obtener la entrada estándar (System.in) y leer una línea de texto
        try {
            System.out.print("Introduce tu nombre: ");
            byte[] input = new byte[100];
            System.in.read(input);
            String name = new String(input).trim();
            System.out.println("Hola, " + name + "!");
        } catch (java.io.IOException e) {
            System.out.println("Error al leer la entrada: " + e.getMessage());
        }

        // Obtener la hora actual en milisegundos desde la época (1970-01-01T00:00:00Z)
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("Hora actual en milisegundos desde la época: " + currentTimeMillis);

        // Obtener el tiempo de inicio del programa
        long startTime = System.nanoTime();
        // Realizar alguna operación
        performTask();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Duración de la tarea en nanosegundos: " + duration);

        // Obtener y mostrar propiedades del sistema
        String osName = System.getProperty("os.name");
        String javaVersion = System.getProperty("java.version");
        System.out.println("Nombre del sistema operativo: " + osName);
        System.out.println("Versión de Java: " + javaVersion);

        // Salir del programa con un código de estado
        // System.exit(0); // Descomentar para finalizar el programa con éxito
    }

    private static void performTask() {
        // Simular una tarea que toma tiempo
        try {
            Thread.sleep(1000); // Dormir por 1 segundo
        } catch (InterruptedException e) {
            System.out.println("Error durante la espera: " + e.getMessage());
        }
    }
}
