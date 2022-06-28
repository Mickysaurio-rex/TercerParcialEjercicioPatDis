package ejercicio5;

public class Web implements IEmpresa2{
    @Override
    public void iniciarSesion() {
        System.out.println("Se esta iniciando sesion");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Se esta cerrando sesion");
    }

    @Override
    public void generacionDeDatos() {
        System.out.println("Mostrando los datos del dipositivo");
    }
}
