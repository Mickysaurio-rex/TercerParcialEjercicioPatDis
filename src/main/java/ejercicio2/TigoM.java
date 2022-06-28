package ejercicio2;

public class TigoM implements IPago{
    @Override
    public void pagar(int monto) {
        System.out.println("Pagando con TigoMoney");
        double descuento = monto - monto*0.02;
        System.out.println("Precio total: " + monto + " Bs");
        System.out.println("Precio con descuento: " + descuento + " Bs");
        System.out.println();
    }
}
