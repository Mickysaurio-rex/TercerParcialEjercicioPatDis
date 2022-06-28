package ejercicio7;

public class Tablet implements ICompu{
    private String tamano;
    private int precio;


    public Tablet(String tamano, int precio) {
        this.tamano = tamano;
        this.precio = precio;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void showInfo(){
        System.out.println("**************INFORMACION**************");
        System.out.println("Tamaño: " + tamano);
        System.out.println("Precio reparacion: " + precio);
    }
}
