package br.com.bieniek.thread;

import br.com.bieniek.thread.runnable.ViajeTarea;

import java.util.Arrays;
import java.util.List;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) throws InterruptedException {

        Thread main = Thread.currentThread();

        Runnable viaje = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " - " + Thread.currentThread().getName());
                try {
                    Thread.sleep((long) (Math.random() * 1000L));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Finalmente me voy de viaje a " + Thread.currentThread().getName());
            System.out.println("Estado de main: " + main.getState());
        };

        Thread v1 = new Thread(viaje, "Isla de Pascua"),
                v2 = new Thread(viaje, "Robinson Crusoe"),
                v3 = new Thread(viaje, "Juan Fernandez"),
                v4 = new Thread(viaje, "Isla de Chiloe");

        List<Thread> threadList = List.of(v1, v2, v3, v4);

        threadList.forEach(Thread::start);

        for (Thread thread : threadList) {
            thread.join();
        }


        // Thread.sleep(10000);

        System.out.println("Continuando la ejecucíon del metodo main: " + main.getName());

    }
}
