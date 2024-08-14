import java.sql.Time;
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
import java.sql.Timestamp;

public class FechasTiempo {

    public static void main(String[] args) {
        // Ejemplo usando java.time (API moderna)

        // Obtener la fecha actual
        LocalDate today = LocalDate.now();
        System.out.println("Fecha actual: " + today);

        // Obtener la hora actual
        LocalTime now = LocalTime.now();
        System.out.println("Hora actual: " + now);

        // Obtener la fecha y hora actuales
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("Fecha y hora actuales: " + dateTimeNow);

        // Crear una fecha y hora específica
        LocalDateTime specificDateTime = LocalDateTime.of(2024, 8, 13, 10, 30);
        System.out.println("Fecha y hora específica: " + specificDateTime);

        // Formatear fecha y hora
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = dateTimeNow.format(formatter);
        System.out.println("Fecha y hora formateada: " + formattedDateTime);

        // Parsear una fecha y hora desde una cadena
        LocalDateTime parsedDateTime = LocalDateTime.parse("13/08/2024 10:30:00", formatter);
        System.out.println("Fecha y hora parseada: " + parsedDateTime);

        // Obtener la zona horaria actual
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("Zona horaria actual: " + zoneId);

        // Obtener la fecha y hora con zona horaria
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Fecha y hora con zona horaria: " + zonedDateTime);

        // Calcular la diferencia entre dos fechas
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.now();
        Period period = Period.between(startDate, endDate);
        System.out.println("Diferencia en años, meses y días: " + period);

        // Comparar dos fechas
        LocalDateTime dateTime1 = LocalDateTime.of(2024, 8, 13, 10, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(2024, 8, 14, 10, 30);
        if (dateTime1.isBefore(dateTime2)) {
            System.out.println("dateTime1 es antes que dateTime2");
        } else if (dateTime1.isAfter(dateTime2)) {
            System.out.println("dateTime1 es después de dateTime2");
        } else {
            System.out.println("dateTime1 es igual a dateTime2");
        }

        // Calcular la duración entre dos tiempos
        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.now();
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duración en horas y minutos: " + duration.toHours() + " horas y " + duration.toMinutes() % 60 + " minutos");

        // Ejemplo usando java.util (API antigua)

        // Crear una fecha actual usando java.util.Date
        Date oldDate = new Date();
        System.out.println("\nFecha actual usando java.util.Date: " + oldDate);

        // Formatear una fecha con SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedOldDate = sdf.format(oldDate);
        System.out.println("Fecha formateada usando SimpleDateFormat: " + formattedOldDate);

        // Parsear una fecha desde una cadena
        try {
            Date parsedOldDate = sdf.parse("13/08/2024 10:30:00");
            System.out.println("Fecha parseada usando SimpleDateFormat: " + parsedOldDate);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Manipular fechas con Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.AUGUST, 13, 10, 30);
        Date calendarDate = calendar.getTime();
        System.out.println("Fecha manipulada con Calendar: " + calendarDate);


        // Crear instancias de java.sql.Date, java.sql.Time y java.sql.Timestamp
        java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
        Time sqlTime = new Time(System.currentTimeMillis());
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        System.out.println("\nFecha SQL: " + sqlDate);
        System.out.println("Hora SQL: " + sqlTime);
        System.out.println("Timestamp SQL: " + timestamp);
    }

}
