package ejercicio5;

public class Ios implements IEmpresa1{
    @Override
    public void login() {
        System.out.println("Se esta iniciando la sesion");
    }

    @Override
    public void logout() {
        System.out.println("Se esta cerrando la sesion");
    }

    @Override
    public void reportes() {
        System.out.println("Mostrando estado del celular....");
    }
}
