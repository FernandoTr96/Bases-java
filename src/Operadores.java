public class Operadores {
    public static void main(String[] args) {

        // Operadores aritméticos
        int a = 10;
        int b = 3;

        int sum = a + b; // Suma: 13
        int difference = a - b; // Resta: 7
        int product = a * b; // Multiplicación: 30
        int quotient = a / b; // División entera: 3
        int remainder = a % b; // Módulo (residuo de la división): 1

        System.out.println("Suma: " + sum);
        System.out.println("Resta: " + difference);
        System.out.println("Multiplicación: " + product);
        System.out.println("División: " + quotient);
        System.out.println("Módulo: " + remainder);

        // Operadores de incremento y decremento
        int x = 5;
        x++; // Incremento: 6
        int y = 5;
        y--; // Decremento: 4

        System.out.println("Incremento: " + x);
        System.out.println("Decremento: " + y);

        // Operadores de comparación
        boolean isEqual = (a == b); // Igualdad: false
        boolean isNotEqual = (a != b); // Desigualdad: true
        boolean isGreaterThan = (a > b); // Mayor que: true
        boolean isLessThan = (a < b); // Menor que: false
        boolean isGreaterThanOrEqual = (a >= b); // Mayor o igual: true
        boolean isLessThanOrEqual = (a <= b); // Menor o igual: false

        System.out.println("Igualdad: " + isEqual);
        System.out.println("Desigualdad: " + isNotEqual);
        System.out.println("Mayor que: " + isGreaterThan);
        System.out.println("Menor que: " + isLessThan);
        System.out.println("Mayor o igual: " + isGreaterThanOrEqual);
        System.out.println("Menor o igual: " + isLessThanOrEqual);

        // Operadores lógicos
        boolean logicalAnd = (a > 5 && b < 5); // AND lógico: true
        boolean logicalOr = (a > 5 || b > 5); // OR lógico: true
        boolean logicalNot = !(a > 5); // NOT lógico: false

        System.out.println("AND lógico: " + logicalAnd);
        System.out.println("OR lógico: " + logicalOr);
        System.out.println("NOT lógico: " + logicalNot);

        // Operadores de asignación
        int c = 5;
        c += 3; // Asignación compuesta (c = c + 3): 8
        c -= 2; // Asignación compuesta (c = c - 2): 6
        c *= 2; // Asignación compuesta (c = c * 2): 12
        c /= 3; // Asignación compuesta (c = c / 3): 4
        c %= 3; // Asignación compuesta (c = c % 3): 1

        System.out.println("Asignación += : " + c);

        // Operadores bit a bit
        int bitwiseAnd = a & b; // AND bit a bit: 2
        int bitwiseOr = a | b; // OR bit a bit: 11
        int bitwiseXor = a ^ b; // XOR bit a bit: 9
        int bitwiseNot = ~a; // NOT bit a bit: -11
        int leftShift = a << 1; // Desplazamiento a la izquierda: 20
        int rightShift = a >> 1; // Desplazamiento a la derecha: 5

        System.out.println("AND bit a bit: " + bitwiseAnd);
        System.out.println("OR bit a bit: " + bitwiseOr);
        System.out.println("XOR bit a bit: " + bitwiseXor);
        System.out.println("NOT bit a bit: " + bitwiseNot);
        System.out.println("Desplazamiento a la izquierda: " + leftShift);
        System.out.println("Desplazamiento a la derecha: " + rightShift);

        // Operador ternario
        int age = 18;
        String result = (age >= 18) ? "Adulto" : "Menor de edad"; // Ternario: Adulto

        System.out.println("Operador ternario: " + result);
    }
}
