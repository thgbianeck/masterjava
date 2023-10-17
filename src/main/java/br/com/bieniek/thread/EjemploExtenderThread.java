package br.com.bieniek.thread;

import br.com.bieniek.thread.threads.NombreThread;

public class EjemploExtenderThread {

    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NombreThread("John Doe");

        System.out.println(((NombreThread) hilo).getInformation());

        hilo.start();
        System.out.println(((NombreThread) hilo).getInformation());

//        Thread.sleep(1000L);
        System.out.println(((NombreThread) hilo).getInformation());

        Thread hilo2 = new NombreThread("Mary Doe");

        System.out.println(((NombreThread) hilo2).getInformation());

        hilo2.start();
        System.out.println(((NombreThread) hilo2).getInformation());
    }
}
