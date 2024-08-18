public class Excepciones {
    public static void main(String[] args) {
        try {
            // Intentar dividir por cero (esto generará una ArithmeticException)
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        } finally {
            System.out.println("Este bloque siempre se ejecuta, independientemente de si ocurrió una excepción o no.");
        }
    }

    // Método que puede lanzar una excepción al dividir
    public static int dividir(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
