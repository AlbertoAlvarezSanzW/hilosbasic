

public class hilo1 extends Thread{

    @Override
    public void run() {
        try {
            System.out.println("Inicio del hilo 1");
            sleep(4000);
            Principal.variableStatica = (int)(Math.random()*(20-4+1)+4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
