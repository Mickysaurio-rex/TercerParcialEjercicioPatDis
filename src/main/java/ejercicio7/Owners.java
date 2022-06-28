package ejercicio7;

public class Owners implements IUsuario{
    String cargo;

    public Owners(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void actualizacion(String msg) {
        System.out.println("Nueva notificacion para: " + cargo);
        System.out.println(msg);
    }
}
