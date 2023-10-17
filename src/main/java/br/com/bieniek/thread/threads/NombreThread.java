package br.com.bieniek.thread.threads;

public class NombreThread extends Thread{

    public NombreThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Se inicia el metodo run del hilo " + getName() + ".");


        for (int i = 0; i < 9; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName() + " - " + i);
        }


        System.out.println("finaliza el hilo " + getName() + ".");
    }

    public String getInformation() {
        return String.format("Thread: %s - State: %s", getName(), getState().name());
    }
}
