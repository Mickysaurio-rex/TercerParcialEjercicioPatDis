package ejercicio5;

public class IosA implements IEmpresa2{
    Ios ios;

    public IosA(Ios ios) {
        this.ios = ios;
    }

    @Override
    public void iniciarSesion() {
        ios.login();
    }

    @Override
    public void cerrarSesion() {
        ios.logout();
    }

    @Override
    public void generacionDeDatos() {
        ios.reportes();
    }
}
