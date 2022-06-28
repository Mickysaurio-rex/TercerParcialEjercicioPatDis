package ejercicio7;

public class SevTec implements IEmpresa {
    private NotiPago notificacion;

    public SevTec(){
        notificacion = new NotiPago();
        notificacion.suscribir(new Owners("Presidente"));
        notificacion.suscribir(new Owners("Vicepresidente"));
        notificacion.suscribir(new Owners("Contabilidad"));
    }

    @Override
    public void repararLaptop(Laptop laptop) {
        System.out.println("> Reparando laptop!");
        laptop.showInfo();
        pagar(laptop.getPrecio());
        notificacion.sendNotification();

    }

    @Override
    public void repararPC(PC pc) {
        System.out.println("> Reparando PC!");
        pc.showInfo();
        pagar(pc.getPrecio());
        notificacion.sendNotification();
    }

    @Override
    public void repararTablet(Tablet tablet) {
        System.out.println("> Reparando tablet!");
        tablet.showInfo();
        pagar(tablet.getPrecio());
        notificacion.sendNotification();
    }

    public void pagar(int cantidad){
        Account.getInstance().pagar(cantidad);
    }

}
