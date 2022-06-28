package ejercicio6;

public class Tv implements IAparato{

    private int costo;
    private String marca;

    private int tamano;

    public Tv(int costo, String marca, int tamano) {
        this.costo = costo;
        this.marca = marca;
        this.tamano = tamano;
    }

    @Override
    public void acept(IAplicacion aplicacion) {
        aplicacion.obtenerEstado(this);
    }

    @Override
    public void mostrar() {
        System.out.println("Costo:" + costo);
        System.out.println("Marca:" + marca);
        System.out.println("Tamaño:" + tamano);
    }


}
