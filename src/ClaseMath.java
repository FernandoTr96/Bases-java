public class ClaseMath {

    public static void main(String[] args) {
        // Ejemplos de métodos de la clase Math

        // Valores de ejemplo
        double a = 25.0;
        double b = 4.0;

        // Operaciones básicas
        double sqrtA = Math.sqrt(a); // Raíz cuadrada de 'a'
        double powAB = Math.pow(a, b); // 'a' elevado a la potencia 'b'
        double maxAB = Math.max(a, b); // Máximo de 'a' y 'b'
        double minAB = Math.min(a, b); // Mínimo de 'a' y 'b'
        double absA = Math.abs(-a); // Valor absoluto de '-a'

        // Operaciones trigonométricas
        double sinA = Math.sin(Math.toRadians(30)); // Seno de 30 grados
        double cosA = Math.cos(Math.toRadians(45)); // Coseno de 45 grados
        double tanA = Math.tan(Math.toRadians(60)); // Tangente de 60 grados

        // Operaciones de redondeo
        double roundA = Math.round(2.5); // Redondeo al entero más cercano
        double ceilA = Math.ceil(2.3); // Redondeo hacia arriba
        double floorA = Math.floor(2.7); // Redondeo hacia abajo

        // Valores extremos
        double randomValue = Math.random(); // Valor aleatorio entre 0.0 y 1.0

        // Mostrar resultados
        System.out.println("Raíz cuadrada de " + a + ": " + sqrtA);
        System.out.println(a + " elevado a la potencia " + b + ": " + powAB);
        System.out.println("Máximo entre " + a + " y " + b + ": " + maxAB);
        System.out.println("Mínimo entre " + a + " y " + b + ": " + minAB);
        System.out.println("Valor absoluto de -"+ a + ": " + absA);
        System.out.println("Seno de 30 grados: " + sinA);
        System.out.println("Coseno de 45 grados: " + cosA);
        System.out.println("Tangente de 60 grados: " + tanA);
        System.out.println("Redondeo de 2.5: " + roundA);
        System.out.println("Redondeo hacia arriba de 2.3: " + ceilA);
        System.out.println("Redondeo hacia abajo de 2.7: " + floorA);
        System.out.println("Valor aleatorio: " + randomValue);
    }
}
