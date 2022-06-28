package ejercicio5;

public class WindowsPhoneA implements IEmpresa2{

    WindowsPhone windowsPhone;

    public WindowsPhoneA(WindowsPhone windowsPhone) {
        this.windowsPhone = windowsPhone;
    }

    @Override
    public void iniciarSesion() {
        windowsPhone.login();
    }

    @Override
    public void cerrarSesion() {
        windowsPhone.logout();
    }

    @Override
    public void generacionDeDatos() {
        windowsPhone.reportes();
    }
}
