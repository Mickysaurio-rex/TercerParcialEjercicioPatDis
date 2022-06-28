package ejercicio6;

public class Celular implements IAparato{

    private int costo;
    private int memoria;
    private String modelo;
    private String marca;

    public Celular(int costo, int memoria, String modelo, String marca) {
        this.costo = costo;
        this.memoria = memoria;
        this.modelo = modelo;
        this.marca = marca;
    }

    @Override
    public void acept(IAplicacion aplicacion) {
        aplicacion.obternerEstado(this);
    }

    @Override
    public void mostrar() {
        System.out.println("Costo:" + costo);
        System.out.println("Memoria:" + memoria);
        System.out.println("Modelo:" + modelo);
        System.out.println("Marca:" + marca);
    }


}
