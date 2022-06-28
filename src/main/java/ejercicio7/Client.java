package ejercicio7;

public class Client {
    public static void main(String[] args){
        SevTec servicio = new SevTec();

        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                servicio.repararLaptop(new Laptop("Grande", 50));
            }
        });

        hilo1.start();

        Thread hilo2 = new Thread(new Runnable() {
            @Override
            public void run() {
                servicio.repararTablet(new Tablet("Pequeño", 100));
            }
        });

        hilo2.start();

        Thread hilo3 = new Thread(new Runnable() {
            @Override
            public void run() {
                servicio.repararPC(new PC("Mediano", 200));
            }
        });

        hilo3.start();
    }
}
