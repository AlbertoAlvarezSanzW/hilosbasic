


public class hilo2 extends Thread{

    Principal clasePrincipal;   // creación de objeto de la clase Principal

    public hilo2(Principal clasePrincipal){ // creación del callback
        this.clasePrincipal = clasePrincipal;
    }


    @Override
    public void run() {

        int hilo1 = Principal.variableStatica;  // esta variable es la que conectara el hilo1 con el 2
        Long tiempoEmpezar = System.currentTimeMillis();

        for (int i = 0; i < hilo1; i++){
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Long tiempoTotal = (System.currentTimeMillis()-tiempoEmpezar)/1000;

        String ejecucion = "El hilo se ha ejecutado: +"+hilo1+" veces";
        String tiempo = "El tiempo que ha tardado es: "+tiempoTotal+" segundos";

        clasePrincipal.pruebadellamadapordios(ejecucion,tiempo);

    }
}
