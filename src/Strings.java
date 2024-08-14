public class Strings {
    public static void main(String[] args) {

        String helloWorld1 = "Hello, World!";
        String helloWorld2 = "Hello, World!"; // Declaración de una cadena de texto

        // Obtener el primer carácter de la cadena
        char firstCharacter = helloWorld1.charAt(0);

        // Obtener la longitud de la cadena
        int length = helloWorld1.length();

        // Concatenar cadenas
        String concatenatedString = helloWorld1 + " " + "Bye, World!";
        concatenatedString = helloWorld1.concat(" Bye, World!");

        // Buscar una subcadena en la cadena
        int index = helloWorld1.indexOf("World");

        // Reemplazar una subcadena en la cadena
        String replacedString = helloWorld1.replace("World", "Universe");

        // Convertir la cadena a mayúsculas
        String upperCaseString = helloWorld1.toUpperCase();

        // Convertir la cadena a minúsculas
        String lowerCaseString = helloWorld1.toLowerCase();

        // Comparar contenido de cadenas
        boolean areEqual = helloWorld1.equals(helloWorld2);

        // Comparar cadenas ignorando mayúsculas/minúsculas
        boolean areEqualIgnoreCase = helloWorld1.equalsIgnoreCase("HELLO, WORLD!");

        // Extraer una subcadena
        String substring = helloWorld1.substring(7, 12); // "World"

        // Eliminar espacios en blanco al inicio y al final
        String trimmedString = "   Hello, World!   ".trim();

        // Verificar si la cadena comienza o termina con una subcadena
        boolean startsWithHello = helloWorld1.startsWith("Hello");
        boolean endsWithWorld = helloWorld1.endsWith("World!");

        // Dividir la cadena en partes
        String[] parts = helloWorld1.split(", ");

        // Convertir la cadena a un array de caracteres
        char[] charArray = helloWorld1.toCharArray();

        // Unir un array de cadenas en una sola cadena
        String joinedString = String.join(", ", "Apple", "Banana", "Cherry");

        // Convertir un valor numérico a cadena
        String numberString = String.valueOf(123);

        // Comprobar si la cadena contiene una subcadena
        boolean containsWorld = helloWorld1.contains("World");

        // Salida de resultados
        System.out.println("First character: " + firstCharacter);
        System.out.println("Length: " + length);
        System.out.println("Concatenated string: " + concatenatedString);
        System.out.println("Index of 'World': " + index);
        System.out.println("Replaced string: " + replacedString);
        System.out.println("Upper case string: " + upperCaseString);
        System.out.println("Lower case string: " + lowerCaseString);
        System.out.println("Are equal: " + areEqual);
        System.out.println("Are equal ignoring case: " + areEqualIgnoreCase);
        System.out.println("Substring: " + substring);
        System.out.println("Trimmed string: " + trimmedString);
        System.out.println("Starts with 'Hello': " + startsWithHello);
        System.out.println("Ends with 'World!': " + endsWithWorld);
        System.out.println("Parts: " + String.join(" | ", parts));
        System.out.println("Char array: " + java.util.Arrays.toString(charArray));
        System.out.println("Joined string: " + joinedString);
        System.out.println("Number as string: " + numberString);
        System.out.println("Contains 'World': " + containsWorld);
    }
}

