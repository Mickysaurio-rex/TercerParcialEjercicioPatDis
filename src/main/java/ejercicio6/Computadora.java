package ejercicio6;

public class Computadora implements IAparato{

    private int costo;
    private int memoria;
    private String marca;

    public Computadora(int costo, int memoria, String marca) {
        this.costo = costo;
        this.memoria = memoria;
        this.marca = marca;
    }

    @Override
    public void acept(IAplicacion aplicacion) {
        aplicacion.obtenerEstado(this);
    }

    @Override
    public void mostrar() {
        System.out.println("Costo:" + costo);
        System.out.println("Memoria:" + memoria);
        System.out.println("Marca:" + marca);
    }


}
