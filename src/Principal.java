public class Principal {

    // creación de la variable static
    static int variableStatica = 0;
    public Principal() throws InterruptedException {
        hilo1 th = new hilo1();
        hilo2 th2 = new hilo2(this);
        th.start();
        th.join();
        th2.start();




    }


    public void pruebadellamadapordios(String nombre, String nombre2){
        System.out.println(nombre);
        System.out.println(nombre2);
    }

}
