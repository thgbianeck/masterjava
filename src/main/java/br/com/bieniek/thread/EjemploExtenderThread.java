package br.com.bieniek.thread;

import br.com.bieniek.thread.threads.NombreThread;

public class EjemploExtenderThread {

    public static void main(String[] args) throws InterruptedException {
        NombreThread
                hilo = new NombreThread("John Doe"),
                hilo2 = new NombreThread("Mary Doe"),
                hilo3 = new NombreThread("Pepe");


        hilo.start();
        hilo2.start();
        hilo3.start();
        System.out.println(hilo.getInformation());
    }
}
