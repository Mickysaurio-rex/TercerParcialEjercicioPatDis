package ejercicio2;

public class Client {
    public static void main(String[] args){
        IPago efectivo = new Efectivo();
        AguaInstalacion instalacion1 = new AguaInstalacion(100);
        instalacion1.setPago(efectivo);
        instalacion1.pagarInstalacion();

        IPago transferencia = new Transferencia();
        AlcantarilladoInstalacion instalacion2 = new AlcantarilladoInstalacion(50);
        instalacion2.setPago(transferencia);
        instalacion2.pagarInstalacion();

        IPago tigoMoney = new TigoM();
        ElectricidadInstalacion instalacion3 = new ElectricidadInstalacion(10);
        instalacion3.setPago(tigoMoney);
        instalacion3.pagarInstalacion();

        IPago app = new Aplicacion();
        instalacion3.setPago(app);
        instalacion3.pagarInstalacion();
    }
}
