package br.com.bieniek.thread.runnable;

import br.com.bieniek.thread.EjemploSincronizacionThread;

import static br.com.bieniek.thread.EjemploSincronizacionThread.*;

public class ImprimirFrases implements Runnable{

    private String frase1, frase2;

    public ImprimirFrases(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {
        imprimirFrases(this.frase1, this.frase2);

    }
}
