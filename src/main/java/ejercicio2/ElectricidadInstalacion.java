package ejercicio2;

public class ElectricidadInstalacion implements IInstalacion{
    private IPago pago;
    private int precio;

    public ElectricidadInstalacion(int precio) {
        this.precio = precio;
    }

    public IPago getPago() {
        return pago;
    }

    public void setPago(IPago pago) {
        this.pago = pago;
    }

    @Override
    public void pagarInstalacion() {
        System.out.println("Instalacion electrica");
        pago.pagar(precio);
    }
}
