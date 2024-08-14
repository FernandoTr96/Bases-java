public class ClaseWrapper {
    public static void main(String[] args) {
        // Ejemplo de uso de clases wrapper
        int intValue = 42;
        double doubleValue = 3.14;
        boolean booleanValue = true;

        // Convertir primitivos a objetos (autoboxing)
        Integer integerObject = intValue; // int a Integer
        Double doubleObject = doubleValue; // double a Double
        Boolean booleanObject = booleanValue; // boolean a Boolean

        // Convertir objetos a primitivos (unboxing)
        int intFromObject = integerObject; // Integer a int
        double doubleFromObject = doubleObject; // Double a double
        boolean booleanFromObject = booleanObject; // Boolean a boolean

        // Mostrar los valores
        System.out.println("Integer object: " + integerObject);
        System.out.println("Double object: " + doubleObject);
        System.out.println("Boolean object: " + booleanObject);
        System.out.println("Primitive int: " + intFromObject);
        System.out.println("Primitive double: " + doubleFromObject);
        System.out.println("Primitive boolean: " + booleanFromObject);

        // Ejemplo de métodos útiles de las clases wrapper
        System.out.println("\nMétodos útiles de las clases wrapper:");

        // Convertir un String a un Integer
        String intString = "123";
        Integer intFromString = Integer.parseInt(intString);
        System.out.println("Integer from String: " + intFromString);

        // Convertir un String a un Double
        String doubleString = "4.56";
        Double doubleFromString = Double.parseDouble(doubleString);
        System.out.println("Double from String: " + doubleFromString);

        // Convertir un String a un Boolean
        String booleanString = "false";
        Boolean booleanFromString = Boolean.parseBoolean(booleanString);
        System.out.println("Boolean from String: " + booleanFromString);

        // Usar métodos de la clase Integer
        System.out.println("\nMétodos de la clase Integer:");
        Integer maxInt = Integer.MAX_VALUE;
        Integer minInt = Integer.MIN_VALUE;
        System.out.println("Valor máximo de Integer: " + maxInt);
        System.out.println("Valor mínimo de Integer: " + minInt);

        // Usar métodos de la clase Double
        System.out.println("\nMétodos de la clase Double:");
        Double pi = Math.PI;
        Double sqrt2 = Math.sqrt(2);
        System.out.println("Valor de PI: " + pi);
        System.out.println("Raíz cuadrada de 2: " + sqrt2);

        // Comparar dos objetos Integer
        Integer a = 128;
        Integer b = 128;
        System.out.println("\nComparación de Integer:");
        System.out.println("a == b: " + (a == b)); // false debido a la caché de valores pequeños
        System.out.println("a.equals(b): " + a.equals(b)); // true

        // Comparar dos objetos Double
        Double x = 0.1;
        Double y = 0.1;
        System.out.println("\nComparación de Double:");
        System.out.println("x == y: " + (x == y)); // true debido a la caché de valores
        System.out.println("x.equals(y): " + x.equals(y)); // true
    }
}
