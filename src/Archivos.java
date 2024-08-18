import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Archivos {
    public static void main(String[] args) {
        // 1. Crear un archivo
        File archivo = new File("ejemplo.txt");
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo.");
            e.printStackTrace();
        }

        // 2. Escribir en un archivo
        try {
            FileWriter escritor = new FileWriter("ejemplo.txt");
            escritor.write("Este es un ejemplo de escritura en un archivo.\n");
            escritor.write("Estamos aprendiendo cómo manejar archivos en Java.\n");
            escritor.close();
            System.out.println("Se ha escrito en el archivo con éxito.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }

        // 3. Leer un archivo
        try {
            List<String> lineas = Files.readAllLines(Paths.get("ejemplo.txt"));
            System.out.println("Contenido del archivo:");
            for (String linea : lineas) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo.");
            e.printStackTrace();
        }

        // 4. Eliminar un archivo
        if (archivo.delete()) {
            System.out.println("El archivo " + archivo.getName() + " ha sido eliminado.");
        } else {
            System.out.println("Ocurrió un error al eliminar el archivo.");
        }
    }
}
