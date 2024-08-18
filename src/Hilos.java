public class Hilos {
    public static void main(String[] args) {
        Thread hiloThread = new MiHiloConThread("John Doe");
        hiloThread.start();
        System.out.println(hiloThread.getState());

        Runnable hiloRunnable = new MiHiloConRunnable("Julia Doe");
        hiloRunnable.run();
        System.out.println(Thread.currentThread().getName());
    }
}

// Crear Hilos con Thread (se usa mas Runnable)
class MiHiloConThread extends Thread {

    public MiHiloConThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // Código a ejecutar en el hilo
        System.out.println("Ejecutando Hilo con Thread: " + getName());

        for (int i = 0; i <10; i++) {
            System.out.println(getName());
        }

        System.out.println("Hilo con Thread Finalizado: " + getName());
    }
}

// Crear Hilos con Runnable
class MiHiloConRunnable implements Runnable {

    private String nombre;

    public MiHiloConRunnable(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        // Código a ejecutar en el hilo
        System.out.println("Ejecutando Hilo con Runnable: " + nombre);

        for (int i = 0; i < 10; i++) {
            System.out.println(nombre);
        }

        System.out.println("Hilo con Runnable Finalizado: " + nombre);
    }
}