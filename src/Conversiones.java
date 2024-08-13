public class Conversiones {
    public static void main(String[] args) {

        // Conversión implícita (automática)
        int intValue = 100;
        long longValue = intValue; // Conversión implícita de int a long
        double doubleValue = intValue; // Conversión implícita de int a double

        // Conversión explícita (casting)
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; // Conversión explícita de double a int

        // Ejemplos de conversiones entre tipos primitivos
        // 1. De byte a int (implícita)
        byte byteValue = 10;
        int intFromByte = byteValue; // Conversión implícita de byte a int

        // 2. De int a byte (explícita)
        int largeIntValue = 1000;
        byte byteFromInt = (byte) largeIntValue; // Conversión explícita de int a byte

        // 3. De char a int (implícita)
        char charValue = 'A';
        int intFromChar = charValue; // Conversión implícita de char a int

        // 4. De int a char (explícita)
        int asciiValue = 65;
        char charFromInt = (char) asciiValue; // Conversión explícita de int a char

        // 5. De long a float (implícita)
        long longValue2 = 123456789L;
        float floatValue = longValue2; // Conversión implícita de long a float

        // 6. De float a long (explícita)
        float anotherFloatValue = 12.34f;
        long longFromFloat = (long) anotherFloatValue; // Conversión explícita de float a long

        // 7. De int a double (implícita)
        int intForDouble = 42;
        double doubleFromInt = intForDouble; // Conversión implícita de int a double

        // 8. De double a int (explícita)
        double largeDoubleValue = 12345.67;
        int intFromDouble = (int) largeDoubleValue; // Conversión explícita de double a int

        // Conversión de String a tipos primitivos usando parse
        String intString = "12345";
        int intFromString = Integer.parseInt(intString); // Conversión de String a int

        String doubleString = "98.76";
        double doubleFromString = Double.parseDouble(doubleString); // Conversión de String a double

        String booleanString = "true";
        boolean booleanFromString = Boolean.parseBoolean(booleanString); // Conversión de String a boolean

    }
}
