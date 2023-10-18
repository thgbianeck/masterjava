package br.com.bieniek.thread;

import br.com.bieniek.thread.runnable.ImprimirFrases;

public class EjemploSincronizacionThread {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new ImprimirFrases("Hola ", "que tal")).start();
        new Thread(new ImprimirFrases("Quién eres ", "tu?")).start();
        Thread.sleep(500);
        Thread h3 = new Thread(new ImprimirFrases("Muchas ", "gracias amigo?"));
        h3.start();
        Thread.sleep(100);
        System.out.println("estado de h3: " + h3.getState());
    }

    public synchronized static void imprimirFrases(String ...frase){
        System.out.print(frase[0]);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(frase[1]);

    }
}
