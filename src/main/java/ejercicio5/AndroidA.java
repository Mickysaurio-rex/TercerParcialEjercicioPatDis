package ejercicio5;

public class AndroidA implements IEmpresa2{

    private Android android;

    public AndroidA(Android android) {
        this.android = android;
    }

    @Override
    public void iniciarSesion() {
        android.login();
    }

    @Override
    public void cerrarSesion() {
        android.logout();
    }

    @Override
    public void generacionDeDatos() {
        android.reportes();
    }
}
