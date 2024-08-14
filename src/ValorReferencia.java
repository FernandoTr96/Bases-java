import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.Period;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ValorReferencia {
    public static void main(String[] args) {
        // Ejemplo de pasar por valor con tipos primitivos
        int x = 10;
        System.out.println("Antes de llamar al método changeValue: x = " + x);
        changeValue(x);
        System.out.println("Después de llamar al método changeValue: x = " + x);

        // Ejemplo de pasar por valor con objetos
        MyObject obj = new MyObject("Original");
        System.out.println("\nAntes de llamar al método changeObject: " + obj.getValue());
        changeObject(obj);
        System.out.println("Después de llamar al método changeObject: " + obj.getValue());
    }

    // Método que modifica un tipo primitivo
    public static void changeValue(int value) {
        value = 20; // Solo se modifica el valor local, no el valor original
    }

    // Método que modifica un objeto
    public static void changeObject(MyObject obj) {
        obj.setValue("Modified"); // Se modifica el contenido del objeto original
    }

    // Clase de ejemplo para demostrar pasar objetos
    static class MyObject {
        private String value;

        public MyObject(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
