// Definición de una clase genérica
class Caja<T> {
    private T contenido;

    public void guardar(T contenido) {
        this.contenido = contenido;
    }

    public T obtener() {
        return contenido;
    }
}

public class Genericos {
    public static void main(String[] args) {
        // Crear una instancia de Caja para almacenar un String
        Caja<String> cajaDeString = new Caja<>();
        cajaDeString.guardar("Hola, Mundo");
        System.out.println("Contenido de la caja: " + cajaDeString.obtener());

        // Crear una instancia de Caja para almacenar un Integer
        Caja<Integer> cajaDeInteger = new Caja<>();
        cajaDeInteger.guardar(123);
        System.out.println("Contenido de la caja: " + cajaDeInteger.obtener());
    }
}